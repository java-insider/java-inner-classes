package innerclass.anonymous;

public class AnonymousInnerClassApp1 {

    public static void main(String[] args) {

        Message message = new Message() {
            @Override
            public String get() {
                return "Hi!";
            }
        };

        Message message2 = new Message() {
            @Override
            public String get() {
                return "Bye!";
            }
        };

        System.out.println(message.get());
        System.out.println(message2.get());
    }
}
