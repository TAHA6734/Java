import com.sun.source.tree.BreakTree;

public class Bachelorstudent extends Student implements ProjectScoreBehavior{
    public Bachelorstudent(int id , float mid , float fin){
        super(id,mid,fin);
    }
    public float projectScore(){
        return 20 ;
    }
    public float computeTotalScore(){
        return computeBaseScore() * projectScore() ;
    }

}
