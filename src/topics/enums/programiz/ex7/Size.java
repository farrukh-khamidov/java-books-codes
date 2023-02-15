package topics.enums.programiz.ex7;

enum Size implements Pizza {
    SMALL, MEDIUM, LARGE, EXTRALARGE;

    public void displaySize() {
        System.out.println("The size is " + this);
    }
}
