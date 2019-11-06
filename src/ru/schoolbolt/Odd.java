package ru.schoolbolt;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите число а ");
        double a = scanner.nextDouble();
        System.out.println("Ведите число b");
        double b = scanner.nextDouble();
        System.out.println("Ведите число c");
        double c = scanner.nextDouble();
        double D;
        System.out.println("Решает квадратное уровнение");
        System.out.println("Ведите a, b, c ");
        if (b == 0) {
            double x;
            x = -b / a;
            System.out.println("x = " + x);
        } else {
            if (c == 0) {
                double x;
                x = -c / b;
                System.out.println("x = " + x);
            } else {
                 if (a == 0) {
                    double x;
                    x = -a / b;
                    System.out.println("x = " + x);
                } else {
                    D = b * b - 4 * a * c;
                    if (D > 0) {
                        double x1, x2;
                        x1 = (-b - Math.sqrt(D)) / (2 * a);
                        x2 = (-b + Math.sqrt(D)) / (2 * a);
                        System.out.println("Корни: x1 = " + x1 + "x2 = " + x2);
                    } else if (D == 0) {
                        double x;
                        x = -b / (2 * a);
                        System.out.println("Корень есть x " + x);
                    } else {
                    }
                }
            }
        }
    }
}