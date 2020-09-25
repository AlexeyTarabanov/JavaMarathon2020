package day4;

import java.util.Arrays;
import java.util.Random;

/**
 * 4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов.
 * Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 *
 * Пример:
 * *Для простоты пример показан на массиве размера 10
 *
 * [1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254]
 *
 * Тройка с максимальной суммой: [5789, 4, 8742]
 *
 * Вывод в консоль:
 * 14535
 * 5
 *
 * *Пояснение.
 * Первое число - сумма тройки [5789, 4, 8742].
 * Второе число - индекс первого элемента тройки, то есть индекс числа 5789.*/

public class Task4 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] mas = new int[100];

        int sum = 0;
        int maxSum = 0;
        int element = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10000);
        }

        for (int i = 0; i < mas.length; i++) {
            if (i != mas.length-2){
                sum = mas[i] + mas[i + 1] + mas[i + 2];
            } else {
                break;
            }

            if (sum > maxSum) {
                maxSum = sum;
                element = i;
            }
        }

        System.out.println(Arrays.toString(mas));
        System.out.println(maxSum);
        System.out.println(element);
    }
}
