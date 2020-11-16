package finalmodifier;

public class Gentleman {
    public static final String MESSAGE_PREFIX = "Hello";


    public void sayHello(String name) {
        System.out.println(MESSAGE_PREFIX + name);
    }

    public static void main(String[] args) {
        Gentleman gentleman = new Gentleman();

        gentleman.sayHello("Bela");

    }

}

