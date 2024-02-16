import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자1");
        String number1 = scanner.next();
        System.out.println("+, -, *, / 중 하나를 입력하시오");
        String opcode = scanner.next();
        System.out.println("숫자2");
        String number2 = scanner.next();

        int result = 0;
        int intNum1 = Integer.parseInt(number1);
        int intNum2 = Integer.parseInt(number2);

        if(opcode.equals("+")){
            result = intNum1 + intNum2;
        }else if(opcode.equals("-")) {
            result = intNum1 - intNum2;
        }else if(opcode.equals("*")) {
            result = intNum1 * intNum2;
        }else if(opcode.equals("/")) {
            result = intNum1 / intNum2;
        }else{
            System.out.println("잘못된 연산기호 입니다");
        }

        System.out.println("첫번째 숫자"+number1);
        System.out.println("두번째 문자"+number2);
        System.out.println("연산결과"+ result);
        }
    }
