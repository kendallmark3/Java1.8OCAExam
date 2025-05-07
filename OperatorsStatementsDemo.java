package com.udemy.oca;

public class OperatorsStatementsDemo {

    public static void main(String[] args) {
        System.out.println("--- Operators ---");

        // 1. Arithmetic Operators
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulo (remainder)
        System.out.println("a++ = " + (a++)); // Post-increment (uses current value, then increments)
        System.out.println("++b = " + (++b)); // Pre-increment (increments, then uses the value)
        System.out.println("Now a = " + a + ", b = " + b);
        System.out.println("--------------------");

        // 2. Relational Operators
        int x = 5;
        int y = 10;
        System.out.println("x == y? " + (x == y)); // Equal to
        System.out.println("x != y? " + (x != y)); // Not equal to
        System.out.println("x > y? " + (x > y)); // Greater than
        System.out.println("x < y? " + (x < y)); // Less than
        System.out.println("x >= y? " + (x >= y)); // Greater than or equal to
        System.out.println("x <= y? " + (x <= y)); // Less than or equal to
        System.out.println("--------------------");

        // 3. Logical Operators
        boolean p = true;
        boolean q = false;
        System.out.println("p && q? " + (p && q)); // Logical AND
        System.out.println("p || q? " + (p || q)); // Logical OR
        System.out.println("!p? " + (!p)); // Logical NOT
        System.out.println("--------------------");

        // 4. Assignment Operators
        int c = 5;
        System.out.println("c = " + c);
        c += 3; // c = c + 3
        System.out.println("c += 3; c = " + c);
        c -= 2; // c = c - 2
        System.out.println("c -= 2; c = " + c);
        c *= 4; // c = c * 4
        System.out.println("c *= 4; c = " + c);
        c /= 2; // c = c / 2
        System.out.println("c /= 2; c = " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3; c = " + c);
        System.out.println("--------------------");

        // 5. Ternary Operator (Conditional Operator)
        int age = 20;
        String isAdult = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age " + age + " is: " + isAdult);
        System.out.println("--------------------");

        System.out.println("--- Statements ---");

        // 1. If-else statement
        int grade = 75;
        if (grade >= 90) {
            System.out.println("Grade A");
        } else if (grade >= 80) {
            System.out.println("Grade B");
        } else if (grade >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Below C");
        }
        System.out.println("--------------------");

        // 2. Switch statement
        int day = 3;
        String dayOfWeek;
        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
            case 7:
                dayOfWeek = "Weekend";
                break;
            default:
                dayOfWeek = "Invalid day";
        }
        System.out.println("Day " + day + " is: " + dayOfWeek);
        System.out.println("--------------------");

        // 3. While loop
        int count = 0;
        System.out.println("While loop:");
        while (count < 5) {
            System.out.println("Count is: " + count);
            count++;
        }
        System.out.println("--------------------");

        // 4. Do-while loop
        int counter = 0;
        System.out.println("Do-while loop:");
        do {
            System.out.println("Counter is: " + counter);
            counter++;
        } while (counter < 3);
        System.out.println("--------------------");

        // 5. For loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("--------------------");

        // 6. Enhanced for loop (for-each)
        int[] numbers = { 10, 20, 30, 40, 50 };
        System.out.println("Enhanced for loop:");
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
        System.out.println("--------------------");
    }
}