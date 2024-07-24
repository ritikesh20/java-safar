package j23;

import java.io.IOException;

public class UserDefineException {
    public static void main(String[] args) throws IOException {
        // throwa dena hi dena hai bina diye huaa kam nhi chale ga
        // dana bhujh kr exception de re hai
        int age = 15;

        if(age < 18){
            throw new IOException("Tu bacha hai abhi");
        }

        System.out.println("Its Woring or not");

    }
}
