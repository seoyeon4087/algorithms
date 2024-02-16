import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력된 점수 중에서 1등 점수를 구하시오");
        System.out.println("시험에 응시한 학생은 총 몇명입니까?");
        int student = sc.nextInt();
        int max = 0;

        String[] names = new String[student];
        int[] scores = new int[student];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("시험에 응시한 학생의 이름은 무엇입니까?");
            String name = sc.next();
            names[i] = name;

            System.out.println("점수를 입력하세요");
            int score = sc.nextInt();
            scores[i] = score;

            System.out.println("이름과 점수 : " + name + " 학생 " + score + "점");

            if (scores[i] > max) {
                max = scores[i];


            }
        }

        System.out.println("1등은 " + names + ", " + max + "점이다");
    }
}