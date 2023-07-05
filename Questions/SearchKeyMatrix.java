package Questions;

import java.util.Scanner;

public class SearchKeyMatrix {

    public void search_algo(int length, int key, int[][] matrix) {
        int counter = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at row = " + i + " column = " + j);
                    counter++;
                }
            }
        }
        if(counter == 0){
            System.out.println("Not Found");
        }
    }

    public int[][] generate_algo(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = i + j;
                matrix[i][j] = num;
            }
        }
        return matrix;
    }

    public void print_matrix(int n, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SearchKeyMatrix searchKeyMatrix = new SearchKeyMatrix();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int key = scanner.nextInt();
        int[][] matrix = searchKeyMatrix.generate_algo(n);
        searchKeyMatrix.print_matrix(n, matrix);
        searchKeyMatrix.search_algo(n, key, matrix);
        scanner.close();
    }

}
