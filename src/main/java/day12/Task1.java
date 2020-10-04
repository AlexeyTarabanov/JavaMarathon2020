package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
 * Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка. Распечатать список.*/

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>(Arrays.asList("Honda", "Toyota", "BMW",
        "KIA", "Lada"));

        cars.add(2, "Mercedes");
        cars.remove(0);

        System.out.println(cars);
    }
}
