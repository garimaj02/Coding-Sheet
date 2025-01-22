import java.util.Map;
import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args){
      int arr[] = {1,2,3,5,4,3,6,7};

      Map<Integer, Integer> frequencyCount = new HashMap<>();
      
      for(int element: arr){
        frequencyCount.put(element, frequencyCount.getOrDefault(element,0)+1);
      }

      System.out.println("printing the array elements and their frequency: ");

      for (Map.Entry<Integer, Integer> entry : frequencyCount.entrySet()) {    
           System.out.println(entry.getKey()+" : " +entry.getValue());
      }
      

      int firstNonRepeatingChar = 0;
      for(int element: arr){
        if(frequencyCount.get(element) == 1){
            firstNonRepeatingChar = element;
            break;
        }
      }

      if(firstNonRepeatingChar != 0){
        System.out.println("The first Non repeating element is " + firstNonRepeatingChar );
      }
      else{
        System.out.println("There is no non repeating element");
      }
    }   
}
