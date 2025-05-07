package com.udemy.oca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

interface StringOperation {
    String operate(String s);
}

interface MathOperation {
    int operate(int a, int b);
}

public class LambdaStreamDemo {

    public static void main(String[] args) {
        System.out.println("--- Lambda Expressions ---");

        // 1. Implementing a functional interface with a lambda
        StringOperation toUpperCase = s -> s.toUpperCase();
        System.out.println("To Uppercase: " + toUpperCase.operate("hello"));

        StringOperation addExclamation = s -> s + "!";
        System.out.println("Add Exclamation: " + addExclamation.operate("world"));

        MathOperation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.operate(5, 3));

        MathOperation multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.operate(5, 3));
        System.out.println("-------------------------");

        // 2. Using lambdas with Collections (ArrayList and sorting)
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));
        System.out.println("Original names: " + names);

        // Sorting by length using a lambda with Comparator
        names.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println("Sorted by length: " + names);

        // Sorting in reverse alphabetical order using a lambda
        names.sort(Comparator.reverseOrder());
        System.out.println("Reverse alphabetical sort: " + names);
        System.out.println("-------------------------");

        // 3. Using lambdas with Streams
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Numbers: " + numbers);

        // Filtering even numbers using a lambda with Predicate
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // Mapping to squares using a lambda with Function
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squared numbers: " + squaredNumbers);

        // Combining filter and map
        List<Integer> squaresOfOdds = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares of odd numbers: " + squaresOfOdds);
        System.out.println("-------------------------");

        // 4. Using lambdas with Maps (though less direct for sorting, can be used with
        // entrySet)
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);
        System.out.println("Ages map: " + ages);

        // Sorting entries by value using a lambda with Comparator
        ages.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println("Sorted by age: " + entry.getKey() + "=" + entry.getValue()));
        System.out.println("-------------------------");
    }
}