package KaupTest;

import java.util.Scanner;
public class KaupMain {
    //카우프지수 구하는 프로그램을 작성해 주세요
    // 150~200cm / 30~99kg

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("신체질량지수(BMI)를 구하시오");

        System.out.println("몸무게를 입력하세요");
        int kg = (int) ((Math.random()*(99-30))+30);
        System.out.println("당신의 몸무게는 "+kg+"kg 입니다");

        System.out.println("신장을 입력하세요");
        double m = (int) ((Math.random()*(200-150))+150);
        System.out.println("당신의 신장은 "+m+"m 입니다");

        double bmi = (kg/(m*m)*10000);

        if(bmi<18.6){
            System.out.println("당신은 저체중입니다");
        } else if(bmi<23){
            System.out.println("당신은 정상입니다");
        } else if(bmi<25){
            System.out.println("당신은 비반 위험입니다");
        } else if(bmi<30){
            System.out.println("당신은 1단계 비만입니다");
        } else if(bmi<35){
            System.out.println("당신은 2단계 비만입니다");
        } else System.out.println("당신은 3단계 비만입니다");

    }
}
