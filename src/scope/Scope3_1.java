package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        // 1. temp는 if 코드 블록에서만 필요하지만, main() 코드 블록이 종료될 때까지 메모리에 유지됨
        // -> 불필요한 메모리가 낭비됨
        // 2. 코드 복잡성 증가 -> 코드를 유지보수 할 때 temp까지 계속 신경 써야함(불필요성)

        if (m > 0) {
            temp = m + 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
