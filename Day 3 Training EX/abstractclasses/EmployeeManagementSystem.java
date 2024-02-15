package abstractclasses;

import java.util.Scanner;

abstract class Employee{
    String name;
    String employeeId;
    double monthlySalary;
    double calcAnnualSalary(){
        return monthlySalary*12;
    }
}

class Manager extends Employee{
    public Manager(double monthlySalary, String employeeId) {
        this.monthlySalary = monthlySalary;
        this.employeeId = employeeId;
        this.name = "Manager";
    }

    @Override
    double calcAnnualSalary() {
        return super.calcAnnualSalary();
    }
}

class Developer extends Employee{
    public Developer(double monthlySalary, String employeeId) {
        this.monthlySalary = monthlySalary;
        this.employeeId = employeeId;
        this.name = "Developer";
    }

    @Override
    double calcAnnualSalary() {
        return super.calcAnnualSalary();
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("For Manager:");
        System.out.print("Monthly Salary = ");
        double managerMonthlySalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Employee ID = ");
        String managerId = sc.nextLine();
        Manager manager = new Manager(managerMonthlySalary, managerId);

        System.out.println("For Developer:");
        System.out.print("Monthly Salary = ");
        double developerMonthlySalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Employee ID = ");
        String developerId = sc.nextLine();
        Developer developer = new Developer(developerMonthlySalary, developerId);

        System.out.println("Manager - Annual Salary: "+manager.calcAnnualSalary());
        System.out.println("Developer - Annual Salary: "+developer.calcAnnualSalary());
    }
}
