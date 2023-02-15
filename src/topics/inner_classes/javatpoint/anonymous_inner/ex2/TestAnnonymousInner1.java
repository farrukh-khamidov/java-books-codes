package topics.inner_classes.javatpoint.anonymous_inner.ex2;

class TestAnnonymousInner1 {
    public static void main(String args[]) {
        Eatable e = new Eatable() {
            public void eat() {
                System.out.println("nice fruits");
            }
        };
        e.eat();
    }
}
