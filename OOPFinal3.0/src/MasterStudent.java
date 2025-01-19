public class MasterStudent extends Student implements ConferanceScoreBehavior{
    protected int numberOfCon ;
    public MasterStudent(int id , float mid , float fin , int numberOfCon){
        super(id, mid, fin);
        this.numberOfCon = numberOfCon ;
    }
    public float computeTotalScore(){
        return super.computeBaseScore() * conferenceScore() ;
    }
    public float conferenceScore(){
        return numberOfCon * 5 ;
    }
}
