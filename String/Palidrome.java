package String;

public class Palidrome {
    public static void main(String[] args){
        String name = "abcba";
        String reverse = "";
        
        for(int i = name.length()-1; i>= 0 ; i--){
            reverse += name.charAt(i);
        }

        if(name.equals(reverse)){
            System.out.println("\n" + name + " is Palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }
    }
}
