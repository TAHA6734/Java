
enum branches{
    MATH("MATH IS BORING"),
    PHYSICS("PHYSICS IS COOL"),
    CS("CS IS STRESSFUL"),
    ENG("ENG IS EASY");

    private String description ;

    branches(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

}
public class Main {
    public static void main(String[] args) {

        teacher teacher1 = new teacher(1,branches.MATH);
        teacher teacher2 = new teacher(2,branches.PHYSICS);
        teacher teacher3 = new teacher(3,branches.CS);
        teacher teacher4 = new teacher(4,branches.ENG);

        teacher[] teachers = {teacher1 , teacher2 ,teacher3 , teacher4} ;

        for(teacher teacher : teachers){
            System.out.println("Teacher ID: " + teacher.getBranches() + " - " + teacher.getBranches().getDescription());
        }


    }
}