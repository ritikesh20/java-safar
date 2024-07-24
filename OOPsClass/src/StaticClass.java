public class StaticClass {
    int age = 45;
   // static int age = 45;

    public static void main(String[] args) {
     //   System.out.println(age);
        StaticClass sc = new StaticClass();
        sc.age = 45;
        System.out.println(sc.age);
// if y want access non static data y have to make objects
    }
}
