public class peakElement {

    public static int peak(int[] arr){
        int length = arr.length;
        if(length == 1){
            return arr[0];
        }

        if(arr[0] >= arr[1]){
            return arr[0];
        }

        if(arr[length-1] > arr[length-2]){
            return arr[length-1];
        }

        for(int i = 1; i<length-1; i++){
            if(arr[i] > arr[i-1] && (arr[i]>arr[i+1])){
                return arr[i];
            }
        }

        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,3,20,4,1,0};

        int result = peak(arr);

        System.out.println("Peak Element: " + result);
    }
}
