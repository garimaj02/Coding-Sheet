package String;

public class ReverseString{
    public static void main(String[] args){
       String str = "Garima";
       reverse(str);
    }

    public static void reverse(String s){
         for(int i=s.length()-1; i>=0; i--){
           char ch = s.charAt(i);
           System.out.print(ch);
         }

         System.out.println();
    }
}