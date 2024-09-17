public class Main {
    public static void main(String[] args) {
        int [][] matrix = {{1, 1, 1, 0}, {0, 5, 0, 1}, {2, 1, 3, 10}};
        System.out.println(extractSum(matrix));
    }

    private static int extractSum(int[][] matrix) {
        int sum=0;
        for (int i = 0; i < matrix[0].length; i++) {
            int rows = 0;
            while (rows < matrix.length){
                if (matrix[rows][i] == 0) break;
                sum+=matrix[rows][i];
                rows++;
            }
        }
        return sum;
    }
}
