package maps;

import java.util.*;

class Employee{
    private int id;
    private String name;
    private String position;

    public Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee ID=" + id +
                ", Name=" + name +
                ", Position=" + position;
    }


}

class CompareEmployee implements Comparator<Map.Entry<Integer, Employee>>{
    @Override
    public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
        return (o1.getKey() - o2.getKey());
    }
}

public class EmployeeDatabase{

    private static TreeMap<Integer, Employee> employeeTreeMap= new TreeMap<>();

    private static void addEmployee(int id, String name, String position){
        Employee employee = new Employee(id, name, position);
        employeeTreeMap.put(id, employee);
        System.out.println("Employee added successfully.");
    }

    private static void retrieveEmpInfo(int id){
        Employee employee = employeeTreeMap.get(id);
        System.out.println(employee!=null ? employee.toString() : "Employee not found!");
    }

    private static void displayEmpList(){
        System.out.println("Employee List:");
        List<Map.Entry<Integer, Employee>> entryList = new ArrayList<>(employeeTreeMap.entrySet());
        Collections.sort(entryList, new CompareEmployee());

        for (Map.Entry<Integer, Employee> entry : entryList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void updateEmpInfo(int id, String newPosition){
        Employee employee = employeeTreeMap.get(id);
        employee.setPosition(newPosition);
        System.out.println("Employee detail Updated");
    }

    private static void removeEmployee(int id){
        if(employeeTreeMap.containsKey(id)){
            employeeTreeMap.remove(id);
            System.out.println("Employee removed successfully.");
        }else {
            System.out.println("Employee not found!");
        }
    }

    public static void main(String[] args) {
        Employee johnDoe = new Employee(104, "John Doe", "Senior Developer");
        Employee varun = new Employee(90, "Varun", "Junior Developer");
        Employee tarun = new Employee(11, "Tarun", "Manager");

        addEmployee(104, "John Doe", "Senior Developer");
        addEmployee(90, "Varun", "Junior Developer");
        addEmployee(11, "Tarun", "Manager");

        System.out.println();
        retrieveEmpInfo(104);

        System.out.println();
        displayEmpList();

        System.out.println();
        updateEmpInfo(11, "General Manager");

        System.out.println();
        displayEmpList();

        System.out.println();
        removeEmployee(90);

        System.out.println();
        displayEmpList();
    }
}
