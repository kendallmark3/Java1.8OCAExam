package com.udemy.oca; // corresponds to a folder (must be in the first line!)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Oca {

    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Initial ArrayList: " + fruits); // Output: [Apple, Banana, Orange, Grapes]

        // 1. Adding an element at a specific index
        fruits.add(1, "Mango"); // Adds "Mango" at index 1
        System.out.println("After adding Mango at index 1: " + fruits); // Output: [Apple, Mango, Banana, Orange,
                                                                        // Grapes]

        // 2. Accessing an element
        String fruitAtIndex2 = fruits.get(2);
        System.out.println("Fruit at index 2: " + fruitAtIndex2); // Output: Banana

        // 3. Updating an element
        fruits.set(3, "Pineapple");
        System.out.println("After updating Orange to Pineapple: " + fruits); // Output: [Apple, Mango, Banana,
                                                                             // Pineapple, Grapes]

        // 4. Removing an element
        fruits.remove("Banana"); // Remove by value
        System.out.println("After removing Banana: " + fruits); // Output: [Apple, Mango, Pineapple, Grapes]

        fruits.remove(0); // Remove by index
        System.out.println("After removing element at index 0: " + fruits); // Output: [Mango, Pineapple, Grapes]

        // 5. Checking if an element exists
        boolean containsMango = fruits.contains("Mango");
        System.out.println("Contains Mango? " + containsMango); // Output: true

        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana? " + containsBanana); // Output: false

        // 6. Finding the index of an element
        int indexOfPineapple = fruits.indexOf("Pineapple");
        System.out.println("Index of Pineapple: " + indexOfPineapple); // Output: 1

        int indexOfBanana = fruits.indexOf("Banana");
        System.out.println("Index of Banana: " + indexOfBanana); // Output: -1 (Not found)

        // 7. Getting the size of the ArrayList
        int sizeOfFruits = fruits.size();
        System.out.println("Size of ArrayList: " + sizeOfFruits); // Output: 3

        // 8. Iterating through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // Using forEach method
        fruits.forEach(System.out::println);

        // 9. Clearing the ArrayList
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits); // Output: []
        System.out.println("Is ArrayList empty: " + fruits.isEmpty());

        // 10. Creating ArrayList with initial capacity
        ArrayList<Integer> numbers = new ArrayList<>(10); // initial capacity of 10.

        // 11. Trimming the ArrayList to size
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.trimToSize(); // Trims the capacity to the current size (3).

        // 12. Converting ArrayList to array
        String[] fruitArray = fruits.toArray(new String[0]); // pass new String[0] - creates empty array of the correct
                                                             // type.
        System.out.println("Array from ArrayList: " + java.util.Arrays.toString(fruitArray));

        // 13. Creating ArrayList from an existing array
        String[] colorArray = { "Red", "Green", "Blue" };
        List<String> colorList = new ArrayList<>(java.util.Arrays.asList(colorArray));
        System.out.println("ArrayList from Array: " + colorList);

        // 14. Sorting an ArrayList
        ArrayList<String> unsortedList = new ArrayList<>();
        unsortedList.add("Charlie");
        unsortedList.add("Alice");
        unsortedList.add("Bob");
        Collections.sort(unsortedList); // Sorts the list in place
        System.out.println("Sorted ArrayList: " + unsortedList); // Output: [Alice, Bob, Charlie]

        // 15. Using addAll to add multiple elements
        ArrayList<String> moreFruits = new ArrayList<>();
        moreFruits.add("Watermelon");
        moreFruits.add("Kiwi");

        fruits.addAll(moreFruits); // Adds all elements from moreFruits to fruits
        System.out.println("ArrayList after addAll: " + fruits); // Output: [Watermelon, Kiwi] (if fruits was empty
                                                                 // before)
    }
}
