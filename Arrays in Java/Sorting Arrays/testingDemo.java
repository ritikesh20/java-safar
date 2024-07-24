package SortingArray;

public class testingDemo {
    public static int fab(int no) {
        if(no <= 1){
            return no;
        }

            return fab(no - 1) + fab(no - 2);


    }

    public static void main(String[] args) {

        int x = 10;

        for (int i = 0; i<x; i++){
            System.out.print(fab(i) + " ");
        }
    }
}
