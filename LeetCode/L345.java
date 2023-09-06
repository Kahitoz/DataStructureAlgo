package LeetCode;
import java.util.ArrayList;
import java.util.Collections;

public class L345 {
    public String reverse(String s){
        ArrayList<Character> characters = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<Character> vowels = new ArrayList<>();
        StringBuilder make_word = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char character = s.charAt(i);
            characters.add(character);
            if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'){
                index.add(i);
                vowels.add(character);
            }
        }
        Collections.reverse(vowels);
        for (int i = 0; i < index.size(); i++) {
            int s_index = index.get(i);
            characters.set(s_index, vowels.get(i));
        }

        for(char letters:characters){
            make_word.append(letters);
        }
        return make_word.toString();
    }
}
