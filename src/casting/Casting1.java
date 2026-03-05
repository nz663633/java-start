package casting;

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
        // 작은 범위 숫자 타입에서 -> 큰 범위 숫자 타입으로의 대입은
        // 직접 형변환을 하지 않아도 된다.(자동 형변환, 묵시적 형변환)
    }
}
