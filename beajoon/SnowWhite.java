package beajoon;

import java.util.Scanner;

public class SnowWhite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {20, 7, 23, 19, 10, 15, 25, 8, 13};

//        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(),
//                sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
//                sc.nextInt(), sc.nextInt()};

        int sum = 0;

        for (int i = 0; i < 9; i++) {
            sum += arr[i];
            for(int j=0; j<8; j++){
                if(sum - (arr[i] + arr[j]) == 100){
                    arr[i] = 0;
                    arr[j] = 0;
                } else {

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();

//        if(sum - (arr[i]+arr[j])==100){
//            arr[i]=0;
//            arr[j]=0;
//        }
        }
    }