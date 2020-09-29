package day8;

/**
 * Создать строку, состоящую из чисел от 0 до 20000.
 * Важно понимать, что это одна строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
 * (0 + “ “ + 1 + “ “ + 2 + … + 20000).
 * После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль сразу все числа из диапазона:
 * 0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
 *
 * Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк (класс String) и использовании StringBuilder,
 * реализуйте описанную задачу этими двумя способами, замеряя время работы программы.*/

public class Task1 {
    public static void main(String[] args) {
        String string = "";
        StringBuilder stringBuilder = new StringBuilder();

        long startString = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            string = string + i + " ";
        }
        long finishString = System.currentTimeMillis();
        long timeConsumedString = finishString - startString;

        long startStringBuilder = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            stringBuilder = stringBuilder.append(i).append(" ");
        }
        long finishStringBuilder = System.currentTimeMillis();
        long timeConsumedStringBuilder = finishStringBuilder - startStringBuilder;

        System.out.println(stringBuilder);
        System.out.println(string);
        System.out.println("Время работы StringBuilder = " + timeConsumedStringBuilder + " мс");
        System.out.println("Время работы String = " + timeConsumedString + " мс");

    }
}
