package topics.inner_classes.geeksforgeeks.anonymous_inner.ex2;

// Main class
class GFG {

    // Class implementing interface
    static Hello h = new Hello() {

        // Method 1
        // show() method inside main class
        public void show() {
            // Print statement
            System.out.println("i am in anonymous class");
        }
    };

    // Method 2
    // Main driver method
    public static void main(String[] args) {
        // Calling show() method inside main() method
        h.show();
    }
}