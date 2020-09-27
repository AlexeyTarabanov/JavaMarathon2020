package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2000);
        car.setModel("Honda");
        car.setColor("Red");
        car.info();
        System.out.println(car.yearDifference(2020));

        Motorbike motorbike = new Motorbike("Kawasaki", "Blue", 2000);
        motorbike.info();
        System.out.println(motorbike.yearDifference(1980));
    }
}
