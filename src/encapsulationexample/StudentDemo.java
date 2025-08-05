package encapsulationexample;

public class StudentDemo {

    public static void main(String[] args) {
        Student s = new Student(); 
        s.setSid(301);
        s.setSname("Dia");
        s.setAvg(3);
        
        System.out.println("student id: " + s.getSid());
        System.out.println("student name: " + s.getSname());
        System.out.println("student average: " + s.getAvg());
        
        System.out.println(s.toString());
    }
}
