package day6;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;


    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFuel() {
        return fuel = 0;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        getFuel();
    }

    public void info() {
        String info = "Изготовитель: " + this.producer + ", год выпуска: " + this.year +
                ", длина: " + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel;
        System.out.println(info);
    }

    public int fillUp(int value) {
        return this.fuel = this.fuel + value;
    }
}
