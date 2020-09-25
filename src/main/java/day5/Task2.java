package day5;

/**
 * 2. Создать класс Мотоцикл (англ. Motorbike), с  полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не использовать).
 * Придерживаться принципов инкапсуляции и использовать ключевое слово this.
 * Геттером получить год выпуска, цвет, модель, вывести значения в консоль.*/

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2000, "Grey", "Harley-Davidson");
        System.out.println(motorbike.getManufactureYear());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getModel());
    }
}

class Motorbike {
    private int manufactureYear;
    private String color;
    private String model;

    public Motorbike(int manufactureYear, String color, String model) {
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
}