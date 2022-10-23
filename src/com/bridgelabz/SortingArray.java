package com.bridgelabz;

public class SortingArray {

    public static void main(String[] args) {
        SortingArray sort = new SortingArray();
        sort.SortArrayInAscendingOrder();
    }

    public void SortArrayInAscendingOrder(){
        int[] a = {11,1,12,3,25,20,8,18};
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){
                int temp;
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
    }
}
