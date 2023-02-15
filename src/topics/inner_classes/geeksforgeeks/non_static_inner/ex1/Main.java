package topics.inner_classes.geeksforgeeks.non_static_inner.ex1;

// Class 2
// Main class
class Main {

    // Main driver method
    public static void main(String[] args) {

        // Note how inner class object is created inside
        // main()
        Outer.Inner in = new Outer().new Inner();

        // Calling show() method over above object created
        in.show();
    }
}
