package BAI_1;

public class Employee extends Person {
    private int salary;

    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;

    }

    @Override
    void display() {
        System.out.println("Emlployee name: " + getName());
        System.out.println("Emlployee address: " + getAddress());
        System.out.println("Emlployee salary: " + salary);

    }
}
