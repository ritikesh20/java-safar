public class MissingNo {
    public static void main(String[] args) {
        //1st - array ko add kro
        //2nd - array ke size ka sum nikalo
        // 3rd - array ke size wale sum se array ke sum ko
        // - kr do vahi Missing No hoga

        int [] arr = {9,6,4,2,3,5,7,0,1};
        int sum = 0;
        int n = arr.length;
        System.out.println("N :" + n);

        int totalSum = (n * (n+1))/2;
        System.out.println(totalSum);

        for (int i = 0; i<arr.length; i++){
            //System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println("ASum :" + sum);
        int ans = totalSum - sum;
        System.out.println("AMs :" + ans);


    }
}
