package schildt_complete.ch12.enumerations.apple.ex3;

// Use an enum constructor.
enum AppleOverloadedConstructor {
    Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);
    private int price; // price of each apple
    // Constructor
    AppleOverloadedConstructor(int p) { price = p; }
    // Overloaded constructor
    AppleOverloadedConstructor() { price = -1; }
    int getPrice() { return price; }
}