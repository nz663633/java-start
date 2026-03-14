package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {
        int row = 5;

        for(int i = 1; i <= row; i++) { // 총 몇 줄을 만들 것인가?
            for(int j = 1; j <= i; j ++) { // 현재 줄에서 별을 몇 번 출력할 것인가?
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }
    }
}
