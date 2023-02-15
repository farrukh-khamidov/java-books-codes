package topics.inner_classes.programiz.static_nested.example6;

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal.Reptile reptile = animal.new Reptile();
        reptile.displayInfo();

        Animal.Mammal mammal = new Animal.Mammal();
        mammal.displayInfo();
//        mammal.eat();
    }
}
