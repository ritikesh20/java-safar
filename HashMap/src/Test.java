import java.util.HashMap;

class Test {
    public static void main(String[] args) {

        int[] arr = {8154, 9139, 8194, 3346, 5450, 9190, 133, 8239, 4606, 8671, 8412, 6290};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int prevCount = map.get(arr[i]);
                map.put(arr[i], prevCount + 1);
            } else if (arr[i] % 2 == 0) {
                map.put(arr[i], 1);
            }
        }

        System.out.println(map);
        int ansCount = 0;
        int ansKey = -1;
        for (var a : map.entrySet()) {
            if (a.getValue() > ansCount) {
                ansCount = a.getValue();
                ansKey = a.getKey();
            }
        }
        System.out.println(ansKey);
    }
}

