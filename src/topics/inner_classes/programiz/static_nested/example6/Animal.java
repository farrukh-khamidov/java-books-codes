package topics.inner_classes.programiz.static_nested.example6;

class Animal {
    static class Mammal {
        public void displayInfo() {
            System.out.println("I am a mammal.");
        }
    }

    class Reptile {
        public void displayInfo() {
            System.out.println("I am a reptile.");
        }
    }

    public void eat() {
        System.out.println("I eat food.");
    }
}
