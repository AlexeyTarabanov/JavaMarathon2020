package day12.task4;

import day12.task4.MusicBand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 4. Выполнять в подпапке task4 в day12*
 * Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было добавлять и
 * удалять участников.
 * Под участником понимается строка (String) с именем и фамилией.
 * Реализовать статический метод слияния групп (в классе MusicBand), т.е. все участники группы А переходят в группу B.
 * Название метода: transferMembers.
 * Этот метод принимает в качестве аргументов два экземпляра класса MusicBand.
 * Реализовать метод printMembers (в классе MusicBand), выводящий список участников в консоль.
 * Проверить состав групп после слияния.*/

public class Task4 {
    public static void main(String[] args) {
        List<String> mt = new ArrayList<>(Arrays.asList("Илья Лагутнеко", "Юрий Цалер"));
        List<String> queens = new ArrayList<>(Arrays.asList("Freddie Mercury", "Brian May"));

        MusicBand mumiyTroll = new MusicBand("Мумий Тролль", 1996, mt);
        MusicBand queen = new MusicBand("Queen", 1970, queens);

        System.out.println(queen);
        MusicBand.transferMembers(mumiyTroll, queen);
        System.out.println(queen);
        queen.printMembers();
    }
}
