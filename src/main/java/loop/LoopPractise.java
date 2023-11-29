package oop;

import java.sql.SQLOutput;

public class LoopPractise {

    public static void main(String[] args) {

        printSquare(7);
    }

    public static void printSquare(int size) {
        String sign;
        for (int i = 0; i < size; i++) {
            for (int y = 0; y < size * 3; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
