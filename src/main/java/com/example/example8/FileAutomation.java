package com.example.example8;

import java.io.IOException;
import java.nio.file.*;

public class FileAutomation {

    public static void main(String[] args) {
        String sourceDir = "D:\\javaprojects\\a(Other Person's Projects)";
        String destinationDir = "D:\\javaprojects";

        try (WatchService watchService = FileSystems.getDefault().newWatchService()) {
            Path sourcePath = Paths.get(sourceDir);
            sourcePath.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);

            System.out.println("Watching for new files in: " + sourceDir);

            while (true) {
                WatchKey key = watchService.take();

                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();

                    if (kind == StandardWatchEventKinds.ENTRY_CREATE) {

                        Path newFilePath = (Path) event.context();
                        Path sourceFile = sourcePath.resolve(newFilePath);
                        Path destinationFile = Paths.get(destinationDir).resolve(newFilePath);

                        try {
                            Files.move(sourceFile, destinationFile, StandardCopyOption.REPLACE_EXISTING);
                            System.out.println("Moved file: " + newFilePath+" to "+destinationDir);
                        } catch (IOException e) {
                            System.err.println("Error moving file: " + e.getMessage());
                        }
                    }
                }

                key.reset();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}