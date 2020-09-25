package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 1. С клавиатуры вводится число n - размер массива.
 * Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10.
 * Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 *
 * Пример:
 * Введено число 10. Сгенерирован следующий массив:
 * [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
 *
 * Информация о массиве:
 * Длина массива: 10
 * Количество чисел больше 8: 1
 * Количество чисел равных 1: 0
 * Количество четных чисел: 6
 * Количество нечетных чисел: 4
 * Сумма всех элементов массива: 46
 * */

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int sum = 0;
        int countEight = 0;
        int countOne = 0;
        int countEven = 0;
        int countOdd = 0;

        int size = scanner.nextInt();
        int[] mas = new int[size];
        for (int i = 0; i < size; i++) {
            mas[i] = random.nextInt(10);
            sum += mas[i];
            if (mas[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            if (mas[i] > 8) {
                countEight++;
            }
            if (mas[i] == 1) {
                countOne++;
            }
        }

        System.out.println(Arrays.toString(mas));
        System.out.println("Длина массива: " + mas.length);
        System.out.println("Количество чисел больше 8: " + countEight);
        System.out.println("Количество чисел равных 1: " + countOne);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
