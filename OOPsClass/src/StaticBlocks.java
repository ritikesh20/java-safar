public class StaticBlocks {
    static {
        System.out.println("Hello");
    }

    // static block run only one time

    static void fun() {
        System.out.println("Hello Fun");
    }

    //Initilizer Bolck
    {
        System.out.println("Initilizer Bolck");
        // Initilizer Bolck connection with object
    }

    void greet() {
        System.out.println("Good Evening");
    }

    StaticBlocks() {
        System.out.println("Default cons");
    }

    public static void main(String[] args) {
        StaticBlocks obj = new StaticBlocks();
        StaticBlocks obj2 = new StaticBlocks();
        obj.greet();
        obj2.greet();
        // 1 static
        //

    }
}
