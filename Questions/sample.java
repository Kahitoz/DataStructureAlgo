import java.util.Scanner;

public class Solution {
    private int num;
    private int den;

    public Solution(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public Solution Add(Solution other) {
        int finalNum = this.num * other.den + other.num * this.den;
        int finalDen = this.den * other.den;
        return new Solution(finalNum, finalDen).Simplify();
    }

    public Solution Multiply(Solution other) {
        int finalNum = this.num * other.num;
        int finalDen = this.den * other.den;
        return new Solution(finalNum, finalDen).Simplify();
    }

    public Solution Simplify() {
        int gcd = gcd(this.num, this.den);
        int finalNum = this.num / gcd;
        int finalDen = this.den / gcd;
        return new Solution(finalNum, finalDen);
    }

    public String toString() {
        return num + "/" + den;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();
        int query = scanner.nextInt();
        Solution F1 = new Solution(numerator, denominator);

        for (int i = 0; i < query; i++) {
            int operation = scanner.nextInt();
            int num = scanner.nextInt();
            int den = scanner.nextInt();

            if (operation == 1) {
                Solution F2 = new Solution(num, den);
                F1 = F1.Add(F2);
                System.out.println(F1);
            } else if (operation == 2) {
                Solution F2 = new Solution(num, den);
                F1 = F1.Multiply(F2);
                System.out.println(F1);
            } else if (operation == 3) {
                Solution F2 = new Solution(num, den);
                Solution result = F2.Simplify();
                System.out.println(result);
            } else {
                System.out.println("");
            }
        }
    }
}
