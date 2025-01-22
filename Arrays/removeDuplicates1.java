import java.util.HashSet;
import java.util.Iterator;

public class removeDuplicates1 {
    public static void main(String[] args){
        int[] unSortedArr = {2,3,1,5,6,3,1};

        HashSet<Integer> removeDuplicates =  new HashSet<>();
        
        for(int i =0; i<unSortedArr.length; i++){
            removeDuplicates.add(unSortedArr[i]);

        }

        System.out.println("After removing Duplicate elements:");

        Iterator itr = removeDuplicates.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
