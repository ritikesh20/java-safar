class carDetails {
    String name;
    int price;
    String color;

//    @Override
//    public String toString() {
//        return "carDetails{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                ", color='" + color + '\'' +
//                '}';
//    }
    carDetails(String car_name, int car_price, String car_color) {
        name = car_name;
        price = car_price;
        color = car_color;
    }
    void display(){
        System.out.println(name + " " + price + " " + color + " ");
    }
}
public class ClassTypes {
    public static void main(String[] args) {
        carDetails car = new carDetails("Bike",50000,"Black");
//        System.out.println(car);//sout by toString();
//        System.out.println(car.color);
        car.display();//sout by class display
    }
}
