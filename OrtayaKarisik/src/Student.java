import java.util.ArrayList;

public class Student extends Person{
    private ArrayList<String> courses ;

    public Student(String name , int id){
        super(name, id);
        this.courses = new ArrayList<>() ;
    }
    public void enrollcourses(){
        courses.add(courses);
    }
    @Override
    public void printDetails() {
        System.out.println("NAME : " + name + "ID : " + id);
        System.out.println(" Enrolled courses " + courses);
    }

}
