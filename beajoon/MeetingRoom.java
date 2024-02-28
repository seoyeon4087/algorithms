package beajoon;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("총 회의가 몇개?");
        int num = sc.nextInt();
        System.out.println(num+"개");

        int[][] meet = new int[num][2];

        for(int i=0;i<num;i++){
            meet[i][0] = sc.nextInt();
            meet[i][1] = sc.nextInt();

            System.out.println();
            System.out.println(meet[i][0] + " " + meet[i][1]);
        }
//        Arrays.sort(meet);


    }
}