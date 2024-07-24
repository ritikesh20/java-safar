import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Find_All_Duplicatesinan {
    public static void main(String[] args) {

        int [] arr = {1,2};

        System.out.println();
//        System.out.println("Size :" + size);
//
//        int ans = size / 3;
//        System.out.println(ans);
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i<arr.length; i++){

            if(map.containsKey(arr[i])){
                int prevCount = map.get(arr[i]);
                map.put(arr[i],prevCount + 1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
        int size = arr.length / 3;

        for (Integer x : map.keySet()){
            if(map.get(x) > size){
                System.out.println(x);
            }
        }
    }
}
