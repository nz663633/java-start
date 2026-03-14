package loop;

public class Break3 {

    public static void main() {
        int sum = 0;

        for(int i = 1; ; i++) { // i는 해당 스코프 내에서만 사용 가능
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i = " + i + ", sum = " + sum);
                break;
            }
        }
    }
}
