package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFuel() {
        return fuel;
    }


    public void info() {
        String info = "Изготовитель: " + this.producer + ", год выпуска: " + this.year +
                ", длина: " + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel;
        System.out.println(info);
    }

    public int fillUp(int value) {
        return fuel += value;
    }

    public static void compareAirplanes(Airplane plane1, Airplane plane2) {
        if (plane1.length > plane2.length) {
            System.out.println("Первый самолет длиннее");
        } else if (plane1.length == plane2.length) {
            System.out.println("Длины самолетов равны");
        } else {
            System.out.println("Второй самолет длиннее");
        }
    }

    @Override
    public String toString() {
        return "Изготовитель: " + producer + ", год выпуска: " + year +
                ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel;
    }
}
