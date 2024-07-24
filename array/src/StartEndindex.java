class StartEnd {
    public static void main(String[] args) {

        int [] arr = {22,33,3,4,33,6,3};

        int n = 6;
        int key = 33;
        for(int i = 0; i<n; i++){
            if(arr[i] == key){
                System.out.print("Start :"+ i);
                break;
            }
        }
        System.out.println();
        for(int i = n; i>0; i--){
            if( arr[i] == key){
                System.out.print("End :"+i);
                break;
            }
        }
    }
}