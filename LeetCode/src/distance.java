public class distance {
    public static void main(String[] args) {
        int[] a = {5 ,3 ,1 ,8 ,3, 23, 2};

        int x = 2;//7
        int y = 5;//0
        int ans = 0;

        int Xindex = -1;
        int Yindex = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                Xindex = i;
            }
            else if (a[i] == y) {
                Yindex = i;
                break;
            }
        }
        if(Xindex == -1 || Yindex == -1){
            System.out.println("-1");
        }
        if(Xindex > Yindex){
            ans = Xindex - Yindex;
        }
        else if(Yindex > Xindex){
            ans = Yindex - Xindex;
        }
        System.out.println(ans);
    }
}
