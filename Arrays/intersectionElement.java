import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class intersectionElement {
    public static void main(String[] args){
        int[] arr1 = {1,2,4,5,6};
        int[] arr2 = {2,2,4,7,8};

        ArrayList<Integer> result = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();

        for(int element: arr1){
            set.add(element);
        }

        for(int element: arr2){
            if(set.contains(element)){
                result.add(element);
            }
        }

        System.out.println("Intersection elements are:" +result);
    }
}
