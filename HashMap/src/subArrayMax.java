import java.util.HashMap;

public class subArrayMax {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            map.put(arr[i],sum);
        }

        for(Integer x : map.keySet()){
            if(map.get(x) == k){
                System.out.println(x);
            }
        }
    }
}
