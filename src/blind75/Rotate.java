package blind75;
//
//public class Rotate {
//    public static void main(String[] args) {
//        int[][] matrix ={{1,2,3},{4,5,6},{7,8,9}};
//        rotate(matrix);
//    }
//
//    public static void rotate(int[][] matrix){
//        int n = matrix.length;
//
//        for (int i = 0; i < (n+1) / 2; i++) {
//            for (int j = 0; j < n/2; j++) {
//                int temp = matrix[n-1-j][i];
//                matrix[n-1-j][i] = matrix[n-1-i][n-j-1];
//                matrix[n-1-i][n-j-1] = matrix[j][n-1-i];
//                matrix[j][n-1-i] = matrix[i][j];
//                matrix[i][j] = temp;
//
//            }
//        }
//    }
//
//}
public class Rotate {

    static void main() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Rotate r = new Rotate();
        r.rotate(matrix);
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = matrix[i][j];
                // left → top
                matrix[i][j] = matrix[n - 1 - j][i];
                // bottom → left
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                // right → bottom
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                // top → right
                matrix[j][n - 1 - i] = temp;
            }
        }
    }
}