public class StudentClass {
    public static class Student{
        String name;
        int RollNo;

        double CGPA;
    }
    public static void main(String[] args) {

        Student x = new Student();

        x.name = "Ritikesh Singh ";
        x.RollNo = 149;
        System.out.println();
        x.CGPA = 8.8;

        System.out.println(x.name);
        System.out.println(x.RollNo);
        System.out.println(x.CGPA);
    }
}