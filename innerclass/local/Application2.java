package innerclass.local;

public class Application2 {
    private final String message = "Hi";

    public void greet(String name) {
        String upperName = name.toUpperCase();

        class Greeter {
            public void sayHi() {
                System.out.format("%s, %s!", message, upperName);
            }
        }

        Greeter greeter = new Greeter();
        greeter.sayHi();
    }
}
