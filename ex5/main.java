package ex5;

public class main {
    public static void main(String[] args) {

        Student student1 = new Student.Builder("AA", "KMITL").age(20).build();
        Student student2 = new Student.Builder("BB", "KMITL").build();
        System.out.println(student1);
        System.out.println(student2);
    }
}
