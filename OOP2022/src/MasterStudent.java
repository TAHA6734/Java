public class MasterStudent extends Student implements ConferanceScoreBehavior{
    protected int numberOfCon ;
    public MasterStudent(int id , int mid , int fin , int numberOfCon){
        super(id,mid,fin);
        this.numberOfCon = numberOfCon ;
    }
    public float computeTotalScore(){
        return conferanceScore() + computeBaseScore() ;
    }
    public float conferanceScore(){
        return numberOfCon * 5 ;
    }
}
