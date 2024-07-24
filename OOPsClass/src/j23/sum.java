package j23;


public class sum {
    public static void main(String[] args) {

        // Unchacked Exception
      try {
          System.out.println(1/0);
      }catch (ArithmeticException e){
          System.out.println(e);
      }
        System.out.println("hello Spark");
    }
}