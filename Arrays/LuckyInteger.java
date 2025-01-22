import java.util.Map;
import java.util.HashMap;

public class LuckyInteger {
    public static void main(String[] args){
      
        int[] nums = {1,2,2,3,3,3};

        int result = lucky(nums);

        System.out.println("Lucky Integer: " + result);
    }

    public static int lucky(int[] nums){

        Map<Integer, Integer> hm = new HashMap();

        for(int i = 0; i<nums.length; i++){
            int element = nums[i];

            hm.put(element, hm.getOrDefault(element, 0)+1);
        }

        int LuckyInteger = -1;

        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(key == value){
                LuckyInteger = Math.max(LuckyInteger, key);
            }
        }
        return LuckyInteger;
    }
}
