package com.bridgelabz;

public class ElementOfAnArray {

    public static void main(String[] args) {
        System.out.println("Element of an given array are: ");
        ElementOfAnArray arr = new ElementOfAnArray();
        arr.printElementOfAnArray();
    }

    public void printElementOfAnArray(){
        int[] a = {12,1,10,8,6,3,2,7,25};
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i] + " ");
        }
    }
}
