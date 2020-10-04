package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *5. Выполнять в подпапке task5 в day12*
 * Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только имя,
 * но и возраст.
 * Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
 * Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом,
 * чтобы участники были - объекты класса MusicArtist.
 * После этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и проверить состав групп после слияния.
 * Методы для слияния и для вывода участников в консоль необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist. */

public class Task5 {
    public static void main(String[] args) {
        MusicArtist mt1 = new MusicArtist("Илья Лагутенко", 51);
        MusicArtist mt2 = new MusicArtist("Юрий Цалер", 47);
        MusicBand mt = new MusicBand("Мумий Тролль", 1996, new ArrayList<>(Arrays.asList(mt1, mt2)));
        System.out.println(mt);

        MusicArtist q1 = new MusicArtist("Freddie Mercury", 45);
        MusicArtist q2 = new MusicArtist("Brian May", 73);
        MusicBand queen = new MusicBand("Queen", 1970, new ArrayList<>(Arrays.asList(q1, q2)));
        System.out.println(queen);

        MusicBand.transferMembers(mt, queen);
        queen.printMembers();
        System.out.println(queen);
    }
}
