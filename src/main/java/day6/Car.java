package day6;

/**
 * В классах Автомобиль и Мотоцикл из прошлого дня реализовать два метода:
 * info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 * yearDifference() - принимает на вход число (год), и возвращает разницу
 * между переданным годом и годом выпуска транспортного средст*/

public class Car {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int year) {
        return year - this.year;
    }
}