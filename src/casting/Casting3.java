package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
        // maxIntOver는 int 범위를 넘어가기 때문에 마지막에 L을 붙여서 long형 사용
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("intValue casting = " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting = " + intValue); // 오버플로우 발생


    }
}
