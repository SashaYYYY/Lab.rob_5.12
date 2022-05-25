package com.company;

public class Fiveth {
    public static void main(String[] args) {
        int ar[] = new int[15];
        int num = 0;
        for (int i = 0; i < 15; i++) {
            ar[i] = (int) Math.round(Math.random() * 10);
            System.out.print(ar[i] + "");
            if (ar[i] % 2 == 0) {
                num++;
            }
        }
        System.out.println(" ");
        System.out.println("Paired elements: " + num);

    }
}

