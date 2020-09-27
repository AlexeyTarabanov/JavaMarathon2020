package day6;

public class Motorbike {
    private int manufactureYear;
    private String color;
    private String model;

    public Motorbike(String model, String color, int manufactureYear) {
        this.manufactureYear = manufactureYear;
        this.color = color;
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year) {
        return this.manufactureYear - year;
    }
}