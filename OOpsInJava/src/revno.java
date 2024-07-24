class x{
    String name;
    int r;

    x(){
        System.out.println("Hello");
    }
}


public class revno {
    public static void main(String[] args) {
        x my = new x();

        my.name = "Ritikesh";
        my.r = 123;
        System.out.println(my.name);
        System.out.println(my.r);
    }
}