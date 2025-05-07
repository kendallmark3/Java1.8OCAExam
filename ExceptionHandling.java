package com.udemy.oca;

// Interface defining a common behavior
interface ErrorHandler {
    void handleError();
}

// Abstract base class representing a generic entity
abstract class Entity {
    private String name;

    public Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void performAction();
}

// Concrete class extending the abstract class
class ErrorProneEntity extends Entity implements ErrorHandler {

    public ErrorProneEntity(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " is performing an action.");
    }

    @Override
    public void handleError() {
        System.out.println(getName() + " is handling an error.");
    }

    // Method that throws an exception
    public void riskyOperation() throws Exception {
        throw new Exception("An error occurred in riskyOperation!");
    }
}

// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Main class with the main method
public class ExceptionHandling {
    public static void main(String[] args) {
        // Demonstrating try-catch
        try {
            ErrorProneEntity entity = new ErrorProneEntity("Entity1");
            entity.performAction();
            entity.riskyOperation(); // This will throw an exception
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // Demonstrating try-with-resources
        try (AutoCloseableResource resource = new AutoCloseableResource()) {
            resource.useResource();
        } catch (Exception e) {
            System.out.println("Caught an exception in try-with-resources: " + e.getMessage());
        }

        // Demonstrating custom exception
        try {
            throw new CustomException("This is a custom exception!");
        } catch (CustomException e) {
            System.out.println("Caught a custom exception: " + e.getMessage());
        }
    }
}

// A class to demonstrate try-with-resources
class AutoCloseableResource implements AutoCloseable {
    public void useResource() throws Exception {
        System.out.println("Using the resource.");
        throw new Exception("Error while using the resource.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing the resource.");
    }
}