package com.bridgelabz;

public class ArrayInReverseOrder {

    public static void main(String[] args) {
        ArrayInReverseOrder rev = new ArrayInReverseOrder();
        rev.elementsOfAnArrayInReverseOrder();
    }

    public void elementsOfAnArrayInReverseOrder(){
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        for(int i = n - 1; i >= 0; i--){
            System.out.println(arr[i] + " ");
        }
    }
}
