import java.util.HashMap;
import java.util.Random;

public class Testing {
    public static void main(String[] args) {

        int[] arr = {15};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                int prevCount = map.get(arr[i]);
                map.put(arr[i],prevCount + 1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);

        System.out.println("Printing Values : ");

        int max = 0;
        for (Integer values : map.values()){
            if(values > max){
                max = values;
            }
        }
        System.out.println(max);
        int sum = 0;

        for (int count : map.values()){
            if(count == max){
                sum = sum + count;
            }
        }

        System.out.println(sum);

    }
}
