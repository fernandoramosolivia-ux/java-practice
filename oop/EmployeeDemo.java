package oop;

abstract class Employee {

    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {

    private final double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    private final double hourlyRate;
    private final int hoursWorked;

    public PartTimeEmployee(
            String name,
            double hourlyRate,
            int hoursWorked
    ) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee[] employees = {
                new FullTimeEmployee(
                        "Fernando",
                        3500
                ),

                new PartTimeEmployee(
                        "Carlos",
                        25,
                        80
                )
        };

        for (Employee employee : employees) {

            System.out.println(
                    employee.getName()
                            + " salary: "
                            + employee.calculateSalary()
            );
        }
    }
}
