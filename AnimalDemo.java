package com.udemy.oca;

// Interface defining a common behavior
interface AnimalSound {
    void makeSound();
}

// Abstract base class representing an Animal
abstract class Animal {
    private String name; // Encapsulation: private access modifier

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method: Abstraction - subclasses must implement this
    public abstract void move();
}

// Concrete subclass: Dog
class Dog extends Animal implements AnimalSound {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is running.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof!"); // Polymorphism: different sound
    }
}

// Concrete subclass: Cat
class Cat extends Animal implements AnimalSound {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is walking stealthily.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows: Meow!"); // Polymorphism: different sound
    }
}

// Main class to demonstrate the concepts
public class AnimalDemo {
    public static void main(String[] args) {
        // Creating instances of concrete classes
        Dog myDog = new Dog("Buddy");
        Cat myCat = new Cat("Whiskers");

        // Encapsulation: Accessing the name through the getter method
        System.out.println("Dog's name: " + myDog.getName());
        System.out.println("Cat's name: " + myCat.getName());
        System.out.println();

        // Polymorphism: Calling the same method on different objects yields different
        // results
        System.out.println("Animal sounds:");
        myDog.makeSound();
        myCat.makeSound();
        System.out.println();

        System.out.println("Animal movements:");
        myDog.move();
        myCat.move();
        System.out.println();

        // Abstraction: We interact with Animals through the abstract Animal class
        Animal genericDog = new Dog("Rover");
        Animal genericCat = new Cat("Mittens");
        genericDog.move();
        genericCat.move();
        System.out.println();

        // Interface: Using the AnimalSound interface
        AnimalSound noisyDog = new Dog("Bolt");
        AnimalSound noisyCat = new Cat("Luna");
        noisyDog.makeSound();
        noisyCat.makeSound();
    }
}