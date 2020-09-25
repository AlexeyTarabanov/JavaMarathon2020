package day5;

/**
 * 1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать геттеры и сеттеры для каждого поля.
 * Создать экземпляр класса Автомобиль, задать сеттером каждое поле,
 * вывести в консоль значение каждого поля геттером.
 * Созданный вами класс должен отвечать принципам инкапсуляции.*/

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Toyota");
        car.setColor("Black");
        car.setManufactureYear(2020);
        System.out.println(car.getModel() + "\n" + car.getColor() + "\n" + car.getManufactureYear());
    }
}

class Car {
    private int manufactureYear;
    private String color;
    private String model;

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
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
}