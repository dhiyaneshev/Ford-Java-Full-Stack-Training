package collections2;

import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    // Employee class definition with attributes like employee ID, name, etc.
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class EmployeeDatabase {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeDatabase = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        System.out.println("Add employee");
        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
//        scanner.nextLine();
        Employee employee = new Employee(id, name);
        employeeDatabase.put(id, employee);
        System.out.println(employeeDatabase);
        System.out.println("Remove employee");
        int idToRem = scanner.nextInt();
        employeeDatabase.remove(idToRem);
        System.out.println("Display all employees");
        System.out.println(employeeDatabase);


        scanner.close();

    }
}