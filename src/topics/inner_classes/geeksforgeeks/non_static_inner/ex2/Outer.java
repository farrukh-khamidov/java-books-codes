package topics.inner_classes.geeksforgeeks.non_static_inner.ex2;

// Java Program to Demonstrate Nested class
// Where Error is thrown

// Class 1
// Outer class
class Outer {

    // Method defined inside outer class
    void outerMethod() {

        // Print statement
        System.out.println("inside outerMethod");
    }

    // Class 2
    // Inner class
    class Inner {

        // Main driver method
        public static void main(String[] args) {

            // Display message for better readability
            System.out.println("inside inner class Method");
        }
    }
}
