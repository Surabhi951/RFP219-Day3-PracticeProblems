package com.bridgelabz;

public class SecondLargestNumberInArray {

    public static void main(String[] args) {
        SecondLargestNumberInArray sl = new SecondLargestNumberInArray();
        sl.secondLargestNumber();
    }

    public void secondLargestNumber(){
        int temp, size;
        int[] array = {5, 15, 25, 67, 85, 27};
        size = array.length;

        for(int i = 0; i < size; i++ ){
            for(int j = i + 1; j < size; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second largest number is: " + array[size-2]);
    }
}
