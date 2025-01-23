package String;
import java.util.HashSet;

public class StringPermutation {
    public static void main(String[] args){

        String str = "abc"; //a, ab, abc, b, bc, ac

        HashSet<String> unique = new HashSet<>();

        for(int i = 0; i<str.length(); i++){
            for(int j = i+1; j<=str.length(); j++){
                String substring = str.substring(i,j);

                unique.add(substring);
            }
        }

        System.out.println("All substring or permutation of string: ");

        for(String element: unique){
            System.out.println(element+ " ");
        }
    }
}
