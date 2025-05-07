package com.udemy.oca;

public class OperatorsDemo {

    public static void main(String[] args) {
        // 1. Arithmetic Operators
        System.out.println("----- Arithmetic Operators -----");
        int a = 10;
        int b = 5;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus (remainder)

        int c = 3;
        System.out.println("a / c = " + (a / c)); // Integer division (truncates)
        double d = 3.0;
        System.out.println("a / d = " + (a / d)); // Floating-point division

        // 2. Unary Operators
        System.out.println("\n----- Unary Operators -----");
        int x = 10;
        System.out.println("x = " + x);
        System.out.println("++x = " + (++x)); // Pre-increment (increment, then use)
        System.out.println("x++ = " + (x++)); // Post-increment (use, then increment)
        System.out.println("x = " + x);
        System.out.println("--x = " + (--x)); // Pre-decrement
        System.out.println("x-- = " + (x--)); // Post-decrement
        System.out.println("x = " + x);

        boolean flag = true;
        System.out.println("flag = " + flag);
        System.out.println("!flag = " + (!flag)); // Logical negation

        // 3. Assignment Operators
        System.out.println("\n----- Assignment Operators -----");
        int y = 10;
        System.out.println("y = " + y);
        y += 5; // y = y + 5
        System.out.println("y += 5: " + y);
        y -= 3; // y = y - 3
        System.out.println("y -= 3: " + y);
        y *= 2; // y = y * 2
        System.out.println("y *= 2: " + y);
        y /= 4; // y = y / 4
        System.out.println("y /= 4: " + y);
        y %= 3; // y = y % 3
        System.out.println("y %= 3: " + y);

        // 4. Relational Operators
        System.out.println("\n----- Relational Operators -----");
        int p = 10;
        int q = 20;
        System.out.println("p = " + p + ", q = " + q);
        System.out.println("p == q: " + (p == q)); // Equal to
        System.out.println("p != q: " + (p != q)); // Not equal to
        System.out.println("p > q: " + (p > q)); // Greater than
        System.out.println("p < q: " + (p < q)); // Less than
        System.out.println("p >= q: " + (p >= q)); // Greater than or equal to
        System.out.println("p <= q: " + (p <= q)); // Less than or equal to

        // 5. Logical Operators
        System.out.println("\n----- Logical Operators -----");
        boolean t = true;
        boolean f = false;
        System.out.println("t = " + t + ", f = " + f);
        System.out.println("t && f: " + (t && f)); // Logical AND
        System.out.println("t || f: " + (t || f)); // Logical OR
        System.out.println("!t: " + (!t)); // Logical NOT

        // 6. Ternary Operator
        System.out.println("\n----- Ternary Operator -----");
        int age = 25;
        String message = (age >= 18) ? "Adult" : "Minor";
        System.out.println("age = " + age + ", message: " + message);

        int num1 = 10, num2 = 20, max;
        max = (num1 > num2) ? num1 : num2;
        System.out.println("Max of " + num1 + " and " + num2 + " is " + max);

        // 7. Bitwise Operators (Less common in everyday Java, but important to know)
        System.out.println("\n----- Bitwise Operators -----");
        int n1 = 5; // 00000101 in binary
        int n2 = 12; // 00001100 in binary
        System.out.println("n1 = " + n1 + ", n2 = " + n2);

        System.out.println("n1 & n2: " + (n1 & n2)); // Bitwise AND (00000100 = 4)
        System.out.println("n1 | n2: " + (n1 | n2)); // Bitwise OR (00001101 = 13)
        System.out.println("n1 ^ n2: " + (n1 ^ n2)); // Bitwise XOR (00001001 = 9)
        System.out.println("~n1: " + (~n1)); // Bitwise NOT (11111010 = -6)

        System.out.println("n1 << 2: " + (n1 << 2)); // Left shift (00010100 = 20)
        System.out.println("n2 >> 2: " + (n2 >> 2)); // Right shift (00000011 = 3)
        System.out.println("n2 >>> 2: " + (n2 >>> 2)); // Unsigned right shift (00000011 = 3)
    }
}