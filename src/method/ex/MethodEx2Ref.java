package method.ex;

public class MethodEx2Ref {

    public static void main(String[] args) {
        String message = "Hello World!";
        repeat(message,3);
        System.out.println("===========");
        repeat("Java",5);
        System.out.println("===========");
        repeat("hi",7);
    }

    public static void repeat(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
