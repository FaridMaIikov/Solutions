package com.example.example10;

import java.util.Scanner;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            String enemy1 = in.next(); // name of enemy 1
            int dist1 = in.nextInt(); // distance to enemy 1
            String enemy2 = in.next(); // name of enemy 2
            int dist2 = in.nextInt(); // distance to enemy 2

            String[] enemies={enemy1,enemy2};

            for(int i=0;i<enemies.length;i++){
                System.out.println(enemies[i]);
            }

            if(dist1>dist2){
                enemy2=null;
            }else{
                enemy1=null;
            }

        }
    }
}