public class Dog extends Animal {

    private static String name = "Rax";

    public Dog() {
        super(name);
    }

    public void sounds() {
        System.out.println("Dog barks");
    }
}
