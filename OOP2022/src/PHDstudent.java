public class PHDstudent extends Student implements ArticleScoreBehavior{
    int numberOfArticles ;
    public PHDstudent(int id , int mid , int fin , int numberOfArticles){
        super(id , mid , fin );
        this.numberOfArticles = numberOfArticles ;
    }
    public float articleScore(){
        return numberOfArticles * 8 ;
    }
    public float computeTotalScore(){
        return articleScore() + computeBaseScore() ;
    }

}
