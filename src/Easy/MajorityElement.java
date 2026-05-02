package Easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {3,3,4};
        System.out.println(majorityElement(nums));

    }
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int a: nums){
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
        int max =0;
        int maxKey = 0;
        for(Integer key: map.keySet()){
            if(map.get(key) > max){
                maxKey = key;
                max = map.get(key);
            }
        }
        return maxKey;
    }
}
