package day11;

public class Picker implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    //при вызове doWork() у Сборщика,
    // происходит увеличение значения поля countOrder в классе Warehouse на 1.
    public void doWork() {
        salary += 80;
        warehouse.setCountOrders(warehouse.getCountOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrders() == 1500) {
            salary = salary * 3;
            System.out.println("Сборщик получил бонус!");
            warehouse.setCountOrders(0);
        }
    }
}
