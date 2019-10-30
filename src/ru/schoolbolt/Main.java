package ru.schoolbolt;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ведите число: ");
        int n = scanner.nextInt();
        if (n > 0) {
            System.out.println("Больше");
        } else if (n == 0) {
            System.out.println("Ровно");
        } else {
            System.out.println("Меньше");
        }
    }
}

