package topics.inner_classes.geeksforgeeks.local_inner.ex1;

// Class 3
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args) {

        // Creating object of outer class inside main()
        // method
        Outer x = new Outer();

        // Calling over the same method
        // as we did for inner class above
        x.outerMethod();
    }
}
