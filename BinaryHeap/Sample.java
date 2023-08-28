import java.util.*;
import java.io.*;

class Solution {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String get_data = scanner.nextLine();
        String[] split_data = get_data.split(" ");
        if (split_data[0].contains(String.valueOf('+')) && split_data[1].contains(String.valueOf('+'))) {
            System.out.println("1st Quadrant");
        } else if (split_data[0].contains(String.valueOf('-')) && split_data[1].contains(String.valueOf('+'))) {
            System.out.println("2nd Quadrant");
        } else if (split_data[0].contains(String.valueOf('+')) && split_data[1].contains(String.valueOf('-'))) {
            System.out.println("3rd Quadrant");
        } else {
            System.out.println("4thQuadrant");
        }
    }
}