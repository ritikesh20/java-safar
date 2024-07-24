class hello{
    int i = 0;

    private hello(){
        i = 5;
        System.out.println("C is Called");
    }
}


public class Main {
    int i = 0;

    private Main(){
        i = 5;
        System.out.println("C is Called");
    }
    public static void main(String[] args) {

        Main hey = new Main();

        System.out.println(hey.i);
    }
}
