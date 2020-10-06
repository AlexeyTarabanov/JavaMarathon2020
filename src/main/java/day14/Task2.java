package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 2. Создать в папке проекта файл people.txt в котором хранятся имена и возраст людей.
 * Реализовать статический метод List<String> parseFileToStringList(),
 * который считывает содержимое этого файла и возвращает список, состоящий из значений имен и возрастов каждого человека.
 * Получить данный список в методе main() и распечатать его в консоль.
 * В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить
 * в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно, необходимо выбрасывать
 * исключение и выводить в консоль сообщение “Некорректный входной файл”.
 *
 * Пример ответа: [Mike 24, John 19, Anna 20, Miguel 5]
 *
 * Пример содержания файла people.txt:
 * Mike 24
 * John 19
 * Anna 20
 * Miguel 5*/

public class Task2 {
    public static void main(String[] args) {

        File file = new File("people");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {

        List<String> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(" ");
                int age = Integer.parseInt(numbers[1]);
                if (age > 0) {
                    list.add(line);
                } else {
                    throw new IOException();
                }
            }
            return list;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }

        return null;
    }
}
