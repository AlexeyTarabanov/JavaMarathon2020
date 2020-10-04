package day12.task5;

import java.util.ArrayList;
import java.util.List;


public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> artists;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.artists = members;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getArtists() {
        return artists;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + artists +
                '}';
    }

    public static MusicBand transferMembers(MusicBand mb1, MusicBand mb2) {
        List<MusicArtist> result = new ArrayList<>(mb1.artists);
        result.addAll(mb2.artists);
        mb1.artists.clear();
        mb2.artists = result;
        return new MusicBand(mb2.name, mb2.year, result);
    }

    public void printMembers() {
        System.out.println("Список участников - " + artists);
    }
}
