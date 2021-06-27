package com.pradeepjc;

public class Main {

    public static void main(String[] args) {
        int[] snowFlakeOneArms = {1,2,3,4,5,6};
        int[] snowFlakeTwoArms = {4,5,6,1,2,3};
        int[] snowFlakeThreeArms = {3,2,1,6,5,4};

        for(int i=0; i<6;i++){
            checkToTheRight(snowFlakeOneArms,snowFlakeTwoArms,i);
            checkToTheLeft(snowFlakeOneArms,snowFlakeThreeArms,i);
        }

    }
    private static boolean checkToTheRight(int[] array1, int[] array2,int start){
        int offset;
        for(offset=0;offset < array1.length; offset++){
            if(array1[offset] != array2[(offset + start) % array1.length]){
                return false;
            }
        }
        System.out.println("Snow flakes one and two are identical from left to right");
        return true;
    }

    private static boolean checkToTheLeft(int[] array1, int[] array2,int start){
        int offset;
        for(offset=0; offset < array1.length;offset++){
            int array2Index = start - offset;
            if(array2Index < 0){
                array2Index+=6;
            }
            if(array1[offset] != array2[array2Index]){
                return false;
            }
        }
        System.out.println("Snow flakes one and three are identical from right to left");
        return true;
    }
}