package topics.inner_classes.geeksforgeeks.static_nested.ex1;

// Outer class
class Outer {

    // Method
    private static void outerMethod() {

        // Print statement
        System.out.println("inside outerMethod");
    }

    // Class 2
    // Static inner class
    static class Inner {

        public static void display() {

            // Print statement
            System.out.println("inside inner class Method");

            // Calling method inside main() method
            outerMethod();
        }
    }
}
