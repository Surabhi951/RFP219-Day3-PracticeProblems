package com.bridgelabz;

public class OddPosition {

    public static void main(String[] args) {
        OddPosition oddPosition = new OddPosition();
        oddPosition.oddPositionInArray();
    }

    public void oddPositionInArray(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        for(int i = 1; i < arr.length; i = i + 2){
            System.out.println("Index: " + i + "," + "value: " + arr[i]);
        }
    }
}
