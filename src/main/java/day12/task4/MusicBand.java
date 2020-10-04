package day12.task4;

import java.util.ArrayList;
import java.util.List;


public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> artistName) {
        this.name = name;
        this.year = year;
        this.members = artistName;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", artistName=" + members +
                '}';
    }

    public static MusicBand transferMembers(MusicBand mb1, MusicBand mb2) {
        List<String> result = new ArrayList<>(mb1.members);
        result.addAll(mb2.members);
        mb1.members.clear();
        mb2.members = result;
        return new MusicBand(mb2.name, mb2.year, result);
    }

    public void printMembers() {
        System.out.println("Список участников - " + members);
    }
}
