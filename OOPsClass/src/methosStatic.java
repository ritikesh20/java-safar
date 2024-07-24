public class methosStatic {
    static int age = 45;
    static void fun(){
        System.out.println("Funning");
    }
    // we access static methods inside class or out side class
    void greet(){

    }
    public static void main(String[] args) {
        methosStatic ms = new methosStatic();
        methosStatic.age = 489;

        System.out.println(methosStatic.age);
    }
}
