package matrixTest;

public class Gugudan {
    public static void main(String[] args) {
        int num1 = 2;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                int num2 = j + 1;
                System.out.printf(num1 + " * " + num2 + " = " + num1 * num2);

            }
            System.out.println(" ");
            num1++;

        }

    }

}
