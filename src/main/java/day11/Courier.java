package day11;

public class Courier implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountOrders(warehouse.getCountOrders() + 1);
        warehouse.setBalance(warehouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() >= 1000000 ) {
            salary = salary * 2;
            System.out.println("Курьер получил бонус!");
            warehouse.setBalance(0);
        }
    }
}
