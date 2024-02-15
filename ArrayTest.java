import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);

        int a = 3;
        int[] arr = {2, 4, 6, 8, 10};
        System.out.println("arr의 길이: "+arr.length);

        for(int i=0;i<=4;i++){

            System.out.println(arr[i]);
        }

    }
}
