package day4;

import java.util.Arrays;
import java.util.Random;

/**
 * 2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Затем, используя циклы for each вывести:
 * наибольший элемент массива
 * наименьший элемент массива
 * количество элементов массива, оканчивающихся на 0
 * сумму элементов массива, оканчивающихся на 0
 *
 * Использовать сортировку запрещено.*/

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] mas = new int[100];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10000);
        }

        int max = 0;
        int min = Integer.MAX_VALUE;
        int countZero = 0;
        int sum = 0;

        for (int i : mas) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
            if (i % 10 == 0) {
                countZero++;
                sum += i;
            }

        }

        System.out.println(Arrays.toString(mas));
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + countZero);
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}

