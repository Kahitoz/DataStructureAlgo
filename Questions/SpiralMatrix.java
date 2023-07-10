package Questions;

//implementation for the spiral matrix
public class SpiralMatrix {
    public void spiralPrint(int[][] matrix, int rows, int columns) {
        int i, j = 0, k = 0;
        while (j < rows && k < columns) {
            for (i = k; i < columns; i++) {
                System.out.print(matrix[j][i] + " ");
            }
            j++;
            for (i = j; i < rows; i++) {
                System.out.print(matrix[i][columns - 1] + " ");
            }
            columns--;
            if (j < rows) {
                for (i = columns - 1; i >= k; i--) {
                    System.out.print(matrix[rows - 1][i] + " ");
                }
                rows--;
            }
            if (k < columns) {
                for (i = rows - 1; i >= j; i--) {
                    System.out.print(matrix[i][k] + " ");
                }
                k++;
            }
        }
    }
    public static void main(String[] args) {
        SearchKeyMatrix matrix = new SearchKeyMatrix();
        SpiralMatrix result = new SpiralMatrix();
        System.out.println("Matrix = ");
        matrix.print_matrix(5, matrix.generate_algo(5));
        System.out.println("Spiral Form = ");
        result.spiralPrint(matrix.generate_algo(5), 5, 5);
    }
}