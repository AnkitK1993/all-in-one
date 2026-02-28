package practice.basic;

import java.util.*;

public class SecondHighestSalary {

    public static void main(String[] args) {
       Employee employee1 = new Employee("Ankit",1000L);
       Employee employee2 = new Employee("Snehal",10000L);
       Employee employee3 = new Employee("Hemant",13000L);
       Employee employee4 = new Employee("Veena",15000L);

         List<Employee> employees = Arrays.asList(employee1,employee2,employee3,employee4);

         String secondHighestSalaryEmployeeName = employees.stream()
                    .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                    .skip(1)
                    .findFirst()
                    .map(Employee::getName)
                    .orElse("No employee found");

        System.out.println(secondHighestSalaryEmployeeName);

        long secondHighestSalary = employees.stream()
                .map(Employee::getSalary)
                .sorted(Collections.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst()
                .orElse(-1L);

        System.out.println("Salary : " + secondHighestSalary);

    }
}

class Employee{

    private String name;
    private long salary;

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

}