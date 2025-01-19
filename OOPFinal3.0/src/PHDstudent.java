public class PHDstudent extends MasterStudent implements ArticleScoreBehavior{
    int numberOfArticles ;
    public PHDstudent(int id , float mid , float fin , int numberOfCon , int numberOfArticles){
        super(id, mid, fin, numberOfCon);
        this.numberOfArticles = numberOfArticles;
    }
    public float computeTotalScore(){
            return computeBaseScore() * articleScore() ;
    }
    public float articleScore(){
            return numberOfArticles * 8 ;
    }
}
