package day2;

import java.util.Scanner;

/**
 * Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число x.
 * Для этого числа, по формуле выше, необходимо вычислить значение y.
 *
 * (Для этих вещественных чисел x и y необходимо использовать тип double и метод nextDouble() у Scanner’а соответственно,
 * чтобы считать из консоли число x).*/

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = 0;
        if (x >= 5) {
           y = (x * x - 10) / (x + 7);
            System.out.println(y);
        } else if (x < 5 && x > -3) {
            y = (x + 3) * (x * x - 2);
            System.out.println(y);
        } else {
            y = 420;
            System.out.println(y);
        }
    }
}
