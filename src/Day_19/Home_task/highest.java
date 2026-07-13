package Day19.Home_task;

import java.util.Arrays;
import java.util.Comparator;

class Employee {

    int id;
    String name;
    String dept;
    int salary;

    Employee(int id, String name, String dept, int salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return id + " " + name + " " + dept + " " + salary;
    }
}

class HighestSalary {

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee(101, "Arun", "IT", 45000),
                new Employee(102, "Bala", "HR", 55000),
                new Employee(103, "Kiran", "IT", 70000),
                new Employee(104, "Ajay", "Sales", 60000),
                new Employee(105, "Vignesh", "HR", 50000)
        };

        Employee emp = Arrays.stream(employees)
                .max(Comparator.comparing(Employee::getSalary))
                .get();

        System.out.println(emp);
    }
}