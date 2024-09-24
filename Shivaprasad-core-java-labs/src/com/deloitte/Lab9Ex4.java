package com.deloitte.lab9.ex4;

import java.util.function.Function;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Lab9Ex4 {
    
    // Method to create a Person instance
    public static Person createPerson(String name, int age) {
        return new Person(name, age);
    }

    public static void main(String[] args) {
        // Using a method reference to create Person instances
        Function<String, Person> personCreator = (name) -> createPerson(name, 25);

        // Create a person using the method reference
        Person person1 = personCreator.apply("Shiv");
        Person person2 = personCreator.apply("Ved");

        // Print the created Person instances
        System.out.println(person1);
        System.out.println(person2);
    }
}
