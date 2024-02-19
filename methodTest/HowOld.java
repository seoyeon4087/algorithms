package methodTest;

import java.util.Scanner;

public class HowOld {

    static int returnAge(Scanner sc){
        System.out.println("학생 나이 : ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = returnAge(sc);
        System.out.println("학생 나이 : " + age);
    }
}
