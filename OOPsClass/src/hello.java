interface Animals {
    //In interface methods are by-default abstract
    //public abstract void eats();
    void eats();
}

interface Pet {
    void sings();
}

class Monkey implements Animals ,Pet{

    @Override
    public void eats() {
        System.out.println("Monkey is eating banana");
    }

    @Override
    public void sings() {
        System.out.println("Dog is Singing");
    }
}

public class hello {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.sings();

    }
}
