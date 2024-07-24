public class MyDetails {
    String name;
    int age;
    double salary;

    void display() {
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Salary :" + salary);
    }

    //  @Override
//    public String toString() {
//        return "MyDetails{" +
//                "Name='" + name + '\'' +
//                ", Age=" + age +
//                ",Salary=" + salary +
//                '}';
//    }
    public static void main(String[] args) {

        MyDetails me = new MyDetails();

        me.name = "Ritikesh Singh";
        me.age = 20;
        me.salary = 20000;

        MyDetails my = new MyDetails();

        my.name = "Hritikesh Singh";
        my.age = 21;
        my.salary = 15000;

        my.display();
        System.out.println();
        me.display();
    }
}
