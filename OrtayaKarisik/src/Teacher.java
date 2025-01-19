import java.util.ArrayList;

public class Teacher extends Person{

private ArrayList<String> teachingcourses ;
public Teacher(String name , int id){
    super(name , id);
    this.teachingcourses = new ArrayList<>();
}

public void assigncourses(){
  teachingcourses.add(teachingcourses);
}
    @Override
    public void printDetails() {
        System.out.println("NAME : " + name + " id " + id );
        System.out.println(teachingcourses);

    }
}
