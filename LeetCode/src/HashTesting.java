import java.util.HashMap;

public class HashTesting {
    public static void main(String[] args) {

        int [] arr = {1,2,3,1,1,3};

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i<arr.length; i++){
            map.put(i,arr[i]);
        }

        System.out.println(map);
    }
}
