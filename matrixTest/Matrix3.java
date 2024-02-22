package matrixTest;

public class Matrix3 {
    public static void main(String[] args) {
        int[][] mtx = new int[5][5];
        int k = 25;
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                mtx[i][j] = k;
                k--;
            }
        }
        System.out.println();
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.printf(mtx[i][j] + " ");
            }
            System.out.println();
        }
    }
}
