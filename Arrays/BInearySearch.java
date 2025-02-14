public class BInearySearch {
    public static void main(String[] args){

        int[] sortedArray = {1,2,2,3,5,6,7,8};
        int target=7;

        int result =  search(sortedArray, target);

        if(target == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
        public static int search(int[] arr, int target){
           int left = 0;
           int right = arr.length-1;
 
           while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if( target > arr[mid]){
                left=mid+1;
            }
            else{
                right = mid-1;
            }
           }
          return -1;
        
    }
}
