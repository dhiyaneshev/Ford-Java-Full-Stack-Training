package collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
    // Student class definition with attributes like name, ID, GPA, etc.
    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name+" (ID: "+id+") - GPA: "+String.format("%.1f",gpa);
    }
}

class StudentGpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student c1, Student c2) {
        return Double.compare(c1.getGpa(), c2.getGpa());
    }
}


public class SortingStudents {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        int numOfInput = scanner.nextInt();
        scanner.next();
        for(int i=0;i<numOfInput;i++) {
            String name = scanner.nextLine();
            int id = scanner.nextInt();
            double gpa = scanner.nextDouble();
            scanner.nextLine();
            studentList.add(new Student(name, id, gpa));
        }

        System.out.println("Students sorted by GPA:");
        Collections.sort(studentList, new StudentGpaComparator());
        for(Student student: studentList){
            System.out.println(student);
        }

        scanner.close();

    }
}