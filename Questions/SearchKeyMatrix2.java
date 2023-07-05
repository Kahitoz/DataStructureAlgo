package Questions;

public class SearchKeyMatrix2 {
    public void search_alt_algo(int n, int key, int[][] matrix) {
        int start = 0;
        int end = n-1;
        while (start < n) {
            if (key == matrix[start][end]) {
                System.out.println("Found at row = " + start + " column = " + end);
                end = end - 1;
                if (end == 0) {
                    start = start + 1;
                    end = n - 1;
                }
            } else {
                end = end - 1;
                if (end == 0) {
                    end = n - 1;
                    start = start + 1;
                }
            }
        }
    }
}
