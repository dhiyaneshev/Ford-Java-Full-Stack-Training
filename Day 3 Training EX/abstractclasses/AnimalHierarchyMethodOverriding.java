package abstractclasses;

import java.util.Scanner;

abstract class Animal {
    // Attributes: name, age
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();
}
class Lion extends Animal {
    // Implement constructor and override makeSound() method using super keyword

    public Lion(String name,int age) {
        super(name,age);
    }

    @Override
    void makeSound() {
        System.out.println("Lion - Sound: Roar");
    }
}
class Elephant extends Animal {
    // Implement constructor and override makeSound() method using super keyword

    public Elephant(String name,int age) {
        super(name,age);
    }

    @Override
    void makeSound() {
        System.out.println("Elephant - Sound: Trumpet");
    }
}


public class AnimalHierarchyMethodOverriding {
    public static void main(String[] args) {
        // Instantiate Lion and Elephant objects, display attributes and the sound they make
        Scanner sc = new Scanner(System.in);

        System.out.println("For Lion:");
        System.out.print("Name = ");
        String lionName = sc.nextLine();
        System.out.print("Age = ");
        int lionAge = sc.nextInt();
        sc.nextLine();
        Lion lion = new Lion(lionName, lionAge);

        System.out.println("For Elephant:");
        System.out.print("Name = ");
        String elephantName = sc.nextLine();
        System.out.print("Age = ");
        int elephantAge = sc.nextInt();
        Elephant elephant = new Elephant(elephantName, elephantAge);

        lion.makeSound();
        elephant.makeSound();

    }
}