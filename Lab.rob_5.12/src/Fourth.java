package com.company;

public class Fourth {
    public static void main(String[] args) {
        int ar1[] = new int[10];
        int ar2[] = new int[10];
        int sum[] = new int[10];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = (int) Math.round(Math.random() * 10);
            ar2[i] = (int) Math.round(Math.random() * 10);
            sum[i] = ar1[i] + ar2[i];
        }
        for (int i = 0; i < ar1.length; i++) {
            System.out.print(ar1[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < ar2.length; j++) {
            System.out.print(ar2[j] + " ");
        }
        System.out.println();
        for (int k = 0; k < sum.length; k++) {
            System.out.print(sum[k] + " ");
        }
    }
}