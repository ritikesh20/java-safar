public class MethodsOverLoading {
    int cal(int a, int b) {
        return a + b;
    }

    Double cal(Double a, Double b) {

        return a + b;
    }
    double cal(int a, Double b){
        return a + b;
    }

    public static void main(String[] args) {

        MethodsOverLoading obj = new MethodsOverLoading();

        System.out.println(obj.cal(4,4.5));
    }
}
