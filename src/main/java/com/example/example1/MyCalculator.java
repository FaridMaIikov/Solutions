package com.example.example1;

class MyCalculator implements AdvancedArithmetic{
    int sum = 0;

    @Override
    public int divisor_sum(int n) {
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }

}