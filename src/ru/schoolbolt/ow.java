package ru.schoolbolt;

import java.util.Scanner;

public class ow {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Ведите n");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }System.out.println();
    }
}