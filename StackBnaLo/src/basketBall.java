class hello {
    String name = "";
    int age = 0;

    hello(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class basketBall {
    public static void main(String[] args) {

        hello h = new hello("Ritikesh", 20);
        h.display();

    }
}
