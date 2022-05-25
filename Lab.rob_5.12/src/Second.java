package com.company;

public class Second {
    public static void main(String[] args) {
        int counter = 0;
        int a[] = new int[20];
        for (int i = 0; i < 20; i++) {
            a[i] = (int) Math.round(Math.random() * 9);
            System.out.print(a[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                a[i] = 0;
            }System.out.print(a[i] + " ");


        }
    }
}

