package com.udemy.oca;

public class LoopsDemo {

    public static void main(String[] args) {
        // 1. Basic for loop
        System.out.println("----- 1. Basic for loop -----");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        // 2. While loop
        System.out.println("\n----- 2. While loop -----");
        int count = 0;
        while (count < 3) {
            System.out.println("count = " + count);
            count++;
        }

        // 3. Do-while loop
        System.out.println("\n----- 3. Do-while loop -----");
        int j = 0;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j < 2);

        // 4. Enhanced for loop (for-each loop)
        System.out.println("\n----- 4. Enhanced for loop (for-each loop) -----");
        String[] fruits = { "Apple", "Banana", "Orange" };
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // 5. For loop with multiple variables
        System.out.println("\n----- 5. For loop with multiple variables -----");
        for (int i = 0, k = 10; i < 5 && k > 5; i++, k--) {
            System.out.println("i = " + i + ", k = " + k);
        }

        // 6. Nested for loops
        System.out.println("\n----- 6. Nested for loops -----");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.println("Row: " + row + ", Col: " + col);
            }
        }

        // 7. labeled break and continue
        System.out.println("\n----- 7. Labeled break and continue -----");
        outerLoop: for (int i = 1; i <= 3; i++) {
            innerLoop: for (int k = 1; k <= 3; k++) { // Changed j to k
                if (i == 2 && k == 2) {
                    break outerLoop; // Breaks out of the outer loop
                    // continue outerLoop; // Jumps to the next iteration of the outer loop
                }
                System.out.println("i = " + i + ", j = " + k);
            }
        }
        // 8. Continue statement
        System.out.println("\n----- 8. Continue statement -----");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue; // Skip iteration when i is 2
            }
            System.out.println("i = " + i);
        }
    }
}
