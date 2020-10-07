package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Вам дан файл с информацией об остатках обуви на складе (src/main/resources/shoes.csv).
 * Это пример реальной выгрузки остатков из 1С в csv файл (формат файла с разделителями, в качестве разделителя использован символ “;”).
 * В этом файле содержится информация о названии модели обуви, ее размер и оставшееся на складе количество.
 * <p>
 * До преобразования в csv это была таблица с тремя колонками:
 * <p>
 * Название 						   Размер	   Кол-во
 * Ботинки HS РАН-Р 400 чер. ЗП			45		4
 * Ботинки PANDA САНИТАРИ 3916 S1 SRC бел.	37		1
 * ...
 * <p>
 * Необходимо сформировать новый файл (src/main/resources/missing_shoes.txt) с информацией о моделях и размерах обуви,
 * которой нет на складе (количество = 0).
 * Для этого реализуйте программу, которая принимает на вход csv файл и создает новый txt файл следующего содержания
 * (должно получиться 11 строк):
 * <p>
 * Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
 * Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
 * Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0
 */

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileRead = new File("src/main/resources/shoes.csv");
        File fileWrite = new File("src/main/resources/missing_shoes.txt");

        Scanner scanner = new Scanner(fileRead);
        PrintWriter printWriter = new PrintWriter(fileWrite);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            String[] numbers = line.split(";");
            int amount = Integer.parseInt(numbers[2]);
            if (amount == 0)
                printWriter.println(line);
        }

        scanner.close();
        printWriter.close();
    }
}
