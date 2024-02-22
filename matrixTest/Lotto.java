package matrixTest;
import java.util.Scanner;
public class Lotto {
    static int returnNum() {
        int randomNum = (int) (Math.random() * 45);
        return randomNum;
    }
    public static void main(String[] args) {
        int arr[] = new int[6];
        for (int i = 0; i < 6; i++) {
            boolean check = false;
            int randomNum = returnNum();
            arr[i] = randomNum;
            System.out.println(arr[i]);
            for (int j = 0; j < 6; j++) {
                if (arr[i]== 0) {
                    // 중복되면 check 를 바꿔라
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}