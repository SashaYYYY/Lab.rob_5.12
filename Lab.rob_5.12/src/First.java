package com.company;

public class First {
        public static void main(String[] args) {
            int a [] = new int [50];
            for (int i = 1, j = 0; i <= 99; i += 2, j++) {
                a [j] = i;
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
