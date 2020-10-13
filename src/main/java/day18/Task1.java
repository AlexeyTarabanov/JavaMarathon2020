package day18;

/**
 * 1. Вам дан числовой массив произвольного размера.
 * Посчитайте сумму чисел в этом массиве не используя циклы (необходимо использовать рекурсивные вызовы).
 *
 * Пример:
 * int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
 * System.out.println(recursionSum(...)); // 65346
 *
 * *recursionSum(...) - это ваш рекурсивный метод, который вернет сумму чисел в массиве numbers.
 */

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, 0));
    }

    public static int recursionSum(int[] mas, int x) {
        if (mas.length == x) {
            return 0;
        }

        return mas[x] + recursionSum(mas, x + 1);
    }
}
