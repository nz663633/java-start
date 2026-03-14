package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        // 5x4 2차원 배열을 만든다.
        int [][] arr = new int[5][4];

        int i = 1;
        // 2차원 배열에 순서대로 1씩 증가하는 값을 입력
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i++;
            }
        }

        // 2차원 배열 출력
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인 변경
        }
    }
}
