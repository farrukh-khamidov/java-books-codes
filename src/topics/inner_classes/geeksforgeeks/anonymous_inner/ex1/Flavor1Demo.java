package topics.inner_classes.geeksforgeeks.anonymous_inner.ex1;

// Class 2
// Main class
class Flavor1Demo {

    //  An anonymous class with Demo as base class
    static Demo d = new Demo() {
        // Method 1
        // show() method
        void show() {
            // Calling method show() via super keyword
            // which refers to parent class
            super.show();

            // Print statement
            System.out.println("i am in Flavor1Demo class");
        }
    };

    // Method 2
    // Main driver method
    public static void main(String[] args) {
        // Calling show() method inside main() method
        d.show();
    }
}
