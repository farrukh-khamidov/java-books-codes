package topics.inner_classes.javatpoint.nested_interface.ex2;

class TestNestedInterface2 implements A.Message {
    public void msg() {
        System.out.println("Hello nested interface");
    }

    public static void main(String args[]) {
        A.Message message = new TestNestedInterface2();//upcasting here
        message.msg();
    }
}
