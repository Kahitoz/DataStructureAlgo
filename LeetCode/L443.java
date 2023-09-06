package LeetCode;
import java.util.ArrayList;
import java.util.Arrays;

public class L443 {
    public char[] compress(char[] chars) {
        int n = chars.length;
        if (n <= 1) {
            return chars;
        } else {
            ArrayList<Character> list = new ArrayList<>();
            for(int i=1; i<chars.length; i++){
                int counter = 0;
                if(chars[i] == chars[i-1]){
                    counter++;
                    if(counter==1){
                        list.add(chars[i]);
                    }
                }
            }
            char [] no_repeat = new char[list.size()];
            for(int i=0; i<list.size(); i++){
                no_repeat[i] = list.get(i);
            }
            return no_repeat;
        }
    }

    public static void main(String[] args) {
        L443 data = new L443();
        char[] arr = { 'a', 'b', 'b', 'a', 'a' };
        System.out.println(Arrays.toString(data.compress(arr)));
    }
}
