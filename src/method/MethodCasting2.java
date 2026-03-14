package method;

public class MethodCasting2 {

    public static void main(String[] args) {
        int number = 100;
        // double형 매개변수에 int형 인수를 전달하는 것은 가능
        printNumber(number);
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
