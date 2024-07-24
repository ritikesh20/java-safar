class cons{
    String name;
    int age;
    cons(String name , int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);

    }
}
public class Pcon {
    public static void main(String[] args) {
        cons kon = new cons("Ritikesh" ,23);

        kon.display();
    }
}


