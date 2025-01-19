public class BachelourStudent extends Student implements ProjectScoreBehavior{
    public BachelourStudent(int id , int mid , int fin){
        super(id , mid , fin );
    }
    float computeTotalScore(){
        return projectScore() + computeBaseScore() ;
    }
    public float projectScore(){
        return 20 ;
    }
}
