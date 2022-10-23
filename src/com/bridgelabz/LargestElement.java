package com.bridgelabz;

public class LargestElement {

    public static void main(String[] args) {
        LargestElement largestElement = new LargestElement();
        largestElement.largestElementInArray();
    }

    public void largestElementInArray(){
        int[] arr = new int[]{12,5,16,25,3,19};
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Smallest element in array is: " + max);
    }
}
