import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자1");
        String num1 = scanner.next();
        System.out.println("+, -, *, / 중 하나를 입력하시오");
        String opcode = scanner.next();
        System.out.println("숫자2");
        String num2 = scanner.next();

        int result = 0;
        int intNum1 = Integer.parseInt(num1);
        int intNum2 = Integer.parseInt(num2);


//        if(opcode.equals("+")){
//            result = intNum1 + intNum2;
//        }else if(opcode.equals("-")) {
//            result = intNum1 - intNum2;
//        }else if(opcode.equals("*")) {
//            result = intNum1 * intNum2;
//        }else if(opcode.equals("/")) {
//            result = intNum1 / intNum2;
//        }else{
//            System.out.println("잘못된 연산기호 입니다");
//        }


        switch (opcode){
            case "+": result = intNum1 + intNum2; break;
            case "-": result = intNum1 - intNum2; break;
            case "*": result = intNum1 * intNum2; break;
            case "/": result = intNum1 / intNum2; break;
            default:
                System.out.println("잘못된 연산자");

        }
        System.out.println("첫번째 숫자 : " + num1);
        System.out.println("두번째 문자 : " + num2);
        System.out.println("연산결과 : " + result);


    }


}
