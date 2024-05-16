
public class Student extends Course {

    String name;
    String department;

    public void displayname(){
        System.out.println("name:"+name);
        System.out.println("department"+department);
    }
    public static void main(String[] args) throws Exception {
        Student s= new Student();
        s.name="vaishnavi";
        s.department="bca";
        s.displayname();
        Course c= new Course();
        c.displaystudentmarks();
    }
}
