package day12.task5;

import java.util.Objects;

public class MusicArtist {
    private String nameArtist;
    private int age;

    public MusicArtist(String nameArtist, int age) {
        this.nameArtist = nameArtist;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "nameArtist='" + nameArtist + '\'' +
                ", age=" + age +
                '}';
    }
}
