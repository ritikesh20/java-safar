import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import static java.util.Collections.list;

public class Testing {
    public static void main(String[] args) {

//        String [] stdName = {"golu", "polu", "dholu", "dholu", "polu"};
//
//        HashMap<String, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < stdName.length; i++) {
//            if (map.containsKey(stdName[i])) {
//                int freq = map.get(stdName[i]);
//                map.put(stdName[i],freq+1);
//            } else {
//                map.put(stdName[i],1);
//            }
//        }
//        System.out.println(map)

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {

                int prevCount = map.get(arr[i]);
                map.put(arr[i], prevCount + 1);

            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        int size = arr.length / 2;
        
    }
}
