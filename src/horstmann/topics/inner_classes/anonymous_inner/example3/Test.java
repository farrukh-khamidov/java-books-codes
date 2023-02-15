package horstmann.topics.inner_classes.anonymous_inner.example3;

public class Test {
    public static void main(String[] args) {
        var queen = new Person("Mary");
        System.out.println(queen);
        // a Person object

        var count = new Person("Dracula") {
        };
        // an object of an inner class extending Person
        System.out.println(count);
    }
}
