package p1;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Accessing elements
        System.out.println("Elements in the ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Getting the size of the ArrayList
        System.out.println("Size of the ArrayList: " + arrayList.size());

        // Checking if the ArrayList contains a specific element
        String searchElement = "Banana";
        if (arrayList.contains(searchElement)) {
            System.out.println(searchElement + " is present in the ArrayList.");
        } else {
            System.out.println(searchElement + " is not present in the ArrayList.");
        }

        // Removing an element
        arrayList.remove("Orange");

        // Displaying elements after removal
        System.out.println("Elements in the ArrayList after removal:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
    }
}
