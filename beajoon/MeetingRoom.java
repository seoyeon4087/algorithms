package beajoon;

import java.util.Scanner;

public class MeetingRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("회의 총 몇개?");
        int num = sc.nextInt();

        int[] mae = new int[num];
        int[] usi = new int[num];
        int[] sum = new int[num];

        for (int i = 0; i < num; i++) {
            mae[i] = sc.nextInt();
            usi[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            if (usi[0] > mae[i]) {
                System.out.println(mae[0] + ", " + usi[0]);

                if (sum[i] == sum[i + 1]) {
                    System.out.println();
                }

            } else if (usi[i] > mae[i + 1]) {
                System.out.println(mae[i] + ", " + usi[i]);
                if (sum[i] == sum[i + 1]) {
                    System.out.println();
                }

            } else {
                System.out.println(mae[i + 1] + ", " + usi[i + 1]);
                if (sum[i] == sum[i + 1]) {
                    System.out.println();
                }
            }
        }
    }
}