import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLArgest {
    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};
        int k = 2; //second largest
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int element: nums){
            maxHeap.add(element);
        }

        System.out.println("Printing the elements of maxHeap by polling: ");

        PriorityQueue<Integer> maxHeapCopy = new PriorityQueue<>(maxHeap);

        while(!maxHeapCopy.isEmpty()){
            System.out.println(maxHeapCopy.poll() + " ");
        }
        System.out.println();

        for(int i =0; i<k-1; i++){
            maxHeap.poll();
        }

        int KthLArgestElement = maxHeap.peek();

        System.out.println("Kth largest element: " + KthLArgestElement);
    }
}
