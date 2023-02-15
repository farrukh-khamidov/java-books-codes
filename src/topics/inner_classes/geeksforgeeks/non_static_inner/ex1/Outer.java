package topics.inner_classes.geeksforgeeks.non_static_inner.ex1;

// Java Program to Demonstrate Nested class

// Class 1
// Helper classes
class Outer {

    // Class 2
    // Simple nested inner class
    class Inner {

        // show() method of inner class
        public void show() {

            // Print statement
            System.out.println("In a nested class method");
        }
    }
}
