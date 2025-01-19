public class MasterStudent extends Student implements  ConferenceScoreBehav{
    protected int numberofCon ;
    public MasterStudent(int id , float mid , float fin , int numberofCon){
        super(id , mid , fin );
        this.numberofCon = numberofCon ;
    }
     float computeTotalScore(){
        return conferenceScore() + computeBaseScore() ;
    }
    public float conferenceScore(){
     return  numberofCon * 5 ;
    }
}
