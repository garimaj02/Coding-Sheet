package String;
import java.util.HashSet;

public class TwoStringSubstring {
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "World";

        HashSet<String> allSubStrings = new HashSet<>();

        boolean found = false;

        for(int i = 0; i<s1.length(); i++){
            for(int j = i+1; j<s1.length(); j++){

                String subString = s1.substring(i,j);
                allSubStrings.add(subString);
            }
        }

        for(int i = 0; i<s2.length(); i++){
            for(int j = i+1; j<s2.length(); j++){

                if(allSubStrings.contains(s2.substring(i,j))){
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("Yes, the strings share a common character.");
        } else {
            System.out.println("No, the strings do not share any common characters.");
        }
    }
}
