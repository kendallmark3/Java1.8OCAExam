package com.udemy.oca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class CoreAPIDemo {

    public static void dateAndTimeAPIs() {
        System.out.println("--- Date and Time APIs ---");

        // LocalDate: Represents a date (year-month-day)
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        LocalDate specificDate = LocalDate.of(2025, 1, 15);
        System.out.println("Specific date: " + specificDate);

        System.out.println("Day of the week for today: " + today.getDayOfWeek());
        System.out.println("Day of the year for today: " + today.getDayOfYear());

        // LocalTime: Represents a time (hour-minute-second-nanosecond)
        LocalTime nowTime = LocalTime.now();
        System.out.println("Current time: " + nowTime);

        LocalTime specificTime = LocalTime.of(10, 30, 0);
        System.out.println("Specific time: " + specificTime);

        System.out.println("Hour of current time: " + nowTime.getHour());

        // LocalDateTime: Represents both date and time
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + nowDateTime);

        LocalDateTime combinedDateTime = LocalDateTime.of(today, specificTime);
        System.out.println("Combined date and time: " + combinedDateTime);

        // Formatting dates and times
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Formatted date: " + today.format(dateFormatter));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Formatted date and time: " + nowDateTime.format(dateTimeFormatter));

        System.out.println();
    }

    public static void fileIOAPIs() {
        System.out.println("--- File I/O APIs ---");

        String filename = "my_example.txt";
        String contentToWrite = "Hello, this is some text written to the file.\nThis is the second line.";

        // Writing to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(contentToWrite);
            System.out.println("Successfully wrote to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("\nReading from " + filename + ":");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        // Working with the File object
        File file = new File(filename);
        System.out.println("\nFile information:");
        System.out.println("File exists: " + file.exists());
        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());

        if (file.exists()) {
            // Clean up the created file
            if (file.delete()) {
                System.out.println(filename + " deleted.");
            } else {
                System.err.println("Failed to delete " + filename + ".");
            }
        }
        System.out.println();
    }

    public static void utilityAPIs() {
        System.out.println("--- Utility APIs ---");

        // Random number generation
        Random random = new Random();
        int randomNumber = random.nextInt(100); // Generates a random integer between 0 (inclusive) and 100 (exclusive)
        System.out.println("Random number (0-99): " + randomNumber);

        double randomDouble = random.nextDouble(); // Generates a random double between 0.0 (inclusive) and 1.0
                                                   // (exclusive)
        System.out.println("Random double (0.0-1.0): " + randomDouble);

        // UUID (Universally Unique Identifier)
        UUID uuid = UUID.randomUUID();
        System.out.println("Generated UUID: " + uuid);

        // ArrayList (dynamic array)
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("ArrayList of names: " + names);
        System.out.println("First name: " + names.get(0));

        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("--- Core API Demonstrations ---");
        dateAndTimeAPIs();
        fileIOAPIs();
        utilityAPIs();
    }
}