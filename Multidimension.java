import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 시험에서 두개 반의 평균 점수를 구하시오");

        System.out.println("1반에서 시험에 응시한 학생수는 몇명입니까");
        int student1 = sc.nextInt();

        System.out.println("2반에서 시험에 응시한 학생수는 몇명입니까");
        int student2 = sc.nextInt();


        int[] scores1 = new int[student1];
        int[] scores2 = new int[student2];

        int avg1 = 0;
        int max1 = 0;
        for (int i = 0; i < scores1.length; i++) {
            //System.out.println("점수를 입력하세요");
            scores1[i] = (int) (Math.random() * 100);
            avg1 += scores1[i];

            if (scores1[i] > max1) {
                max1 = scores1[i];
            }
        }

        int avg2 = 0;
        int max2 = 0;
        for (int i = 0; i < scores2.length; i++) {
            //System.out.println("점수를 입력하세요");
            scores2[i] = (int) (Math.random() * 100);
            avg2 += scores2[i];

            if (scores2[i] > max2) {
                max2 = scores2[i];
            }
        }

        System.out.println("1반의 평균 점수 : " + (avg1/student1) + "점 이고");
        System.out.println("1반의 1등 점수는 : " + max1 + "점 이다");

        System.out.println("2반의 평균 점수 : " + (avg2 / student2) + "점 이고");
        System.out.println("2반의 1등 점수는 : " + max2 + "점 이다");
    }
}

