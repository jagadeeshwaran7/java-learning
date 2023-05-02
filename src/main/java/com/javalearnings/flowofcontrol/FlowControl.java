package com.javalearnings.flowofcontrol;

public class FlowControl {

    public static void main(String[] args) {

        int input = 15;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }

        for (int i = input - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
