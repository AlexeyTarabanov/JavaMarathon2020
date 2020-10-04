package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 3. *Выполнять в подпапке task3 в day12*
 * Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
 * Создать 10 или более экземпляров класса MusicBand , добавить их в список
 * (выбирайте такие музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен).
 * Перемешать список. Создать статический метод в классе Task3:
 * public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
 * Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп,
 * основанных после 2000 года.
 * Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из 10 групп.
 * Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).*/

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("The Beatles", 1960));
        bands.add(new MusicBand("The Rolling Stones", 1962));
        bands.add(new MusicBand("U2", 1976));
        bands.add(new MusicBand("Coldplay", 1996));
        bands.add(new MusicBand("Radiohead", 1985));
        bands.add(new MusicBand("Nirvana", 1987));
        bands.add(new MusicBand("The Killers", 2001));
        bands.add(new MusicBand("Thirty Seconds to Mars", 1998));
        bands.add(new MusicBand("Arctic Monkeys", 2002));
        bands.add(new MusicBand("A Day to Remember", 2003));

        Collections.shuffle(bands);

        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));



    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand musicBand : bands) {
            if (musicBand.getYear() > 2000)
                bandsAfter2000.add(musicBand);
        }

        return bandsAfter2000;
    }
}

