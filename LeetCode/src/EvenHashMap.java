import java.util.ArrayList;
import java.util.HashMap;

public class EvenHashMap {
    public static void main(String[] args) {

        int [] nums = {0,0,1,6,6,4,4,1,10,10,12,12};

        HashMap<Integer,Integer> map = new HashMap <>();

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int prevCount = map.get(nums[i]);
                map.put(nums[i],prevCount + 1);
            }
            else if(nums[i] % 2 == 0){
                map.put(nums[i],1);
            }
        }
        System.out.println(map);
        int max = -1;


        for (Integer x : map.keySet()){
            if(map.get(x) > max){
                max = x;
            }
        }
        System.out.println(max);
    }
}
