interface conferance_behavior{
    float conferanceScore(int conferanceNumber);

}
interface Article_behavior{
    float articleScore(int articleNumber);
}
interface project_behavior{
    float projectScore();
}
abstract class Student{
    protected int id ;
    protected float mid ;
    protected float fin ;

    public Student(int id , float mid , float fin){
        this.id = id ;
        this.mid = mid;
        this.fin = fin ;
    }
    public abstract float computeScore();


}
class bechelorStudent extends Student implements project_behavior{

    public bechelorStudent(int id , float mid , float fin ){
        super(id , mid , fin ) ;
    }

    @Override
    public float projectScore() {
        return 20;
    }

    @Override
    public float computeScore() {
        return ((mid*40) + (fin*60));
    }
}
class masterStudent extends  Student implements conferance_behavior{

    int conferanceNumber ;
    public masterStudent(int id , float mid , float fin , int conferanceNumber){
        super(id , mid , fin);
        this.conferanceNumber = conferanceNumber;
    }

    @Override
    public float conferanceScore(int conferanceNumber) {
        return conferanceNumber * 5 ;
    }

    @Override
    public float computeScore() {
        return ((mid*40) + (fin*60) + (conferanceScore(conferanceNumber)));
    }
}

class PHDstudent extends Student implements conferance_behavior , Article_behavior{

    int conferanceNumber ;
    int articleNumber ;

    public PHDstudent(int id , float mid , float fin , int conferanceNumber , int articleNumber){
        super(id , mid , fin );
        this.conferanceNumber = conferanceNumber ;
        this.articleNumber =articleNumber ;
    }

    @Override
    public float conferanceScore(int conferanceNumber) {
        return conferanceNumber * 5 ;
    }

    @Override
    public float articleScore(int articleNumber) {
        return articleNumber * 8 ;
    }

    @Override
    public float computeScore() {
        return (mid * 40 )   + ( fin * 60 )  + articleScore(articleNumber) + conferanceScore((conferanceNumber));
    }
}


public class Main{
    public static void main(String[] args){
        bechelorStudent bechelorStudent = new bechelorStudent(1 ,  85,64 );
        masterStudent masterStudent = new masterStudent(2,80,60,10);
        PHDstudent PHDstudent = new PHDstudent(3 , 55 ,60 ,20 ,5);

        System.out.println( " The Total Score of bechelorStudent " + bechelorStudent.projectScore());
        System.out.println(" The total Score of master student " + masterStudent.computeScore());
        System.out.println(" The total Scoere of Phd student " + PHDstudent.computeScore());
    }
}

