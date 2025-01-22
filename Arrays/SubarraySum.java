public class SubarraySum {
    public static void main(String[] args){
        int arr[] = {1,2,3,7,5};
        int targetSum = 12;

        for(int i = 0; i<arr.length; i++){
            int currentSum=0;

            for(int j = 1; j<arr.length; j++){
               currentSum += arr[j];

               if(currentSum == targetSum){
                System.out.println("Subarray found between indexes: " + i + " and "+ j);
                return;
               }
            }
        }
        System.out.println("Subarray not found");
    }
}
