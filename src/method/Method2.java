package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    // 반환 타입이 없는 경우 void로 정의
    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return;
    }

    // 모든 메서드는 무조건 return을 호출해야함
    // 하지만 void의 경우 return 생략 가능
    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
