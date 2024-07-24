import java.util.HashMap;

public class CmpString {
    public static void main(String[] args) {

        HashMap<String,Integer> team = new HashMap<>();

        team.put("Ritikesh",20);
        team.put("Rohit",45);
        team.put("Dhoni",7);
        team.put("Virat",18);
        team.put("Rishi",31);

//        for (String a : team.keySet()){
//            System.out.println(a);
//        }
//
//        for (int x : team.values()){
//            System.out.println(x);
//        }
//
       team.forEach((key,value)->{
           System.out.println(key + "-> " + value);
       });



    }
}
