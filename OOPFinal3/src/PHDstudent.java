public class PHDstudent extends MasterStudent implements ArticleScoreBehav{
int numberOfArticles ;
public PHDstudent(int id , float mid , float fin , int numberofCon,int numberOfArticles){
    super(id, mid, fin, numberofCon);
    this.numberOfArticles = numberOfArticles ;
}
public float computeTotalScore(){
  return   computeBaseScore() +articleScore() ;
}

    @Override
    public float articleScore() {
      return   numberOfArticles * 8 ;
    }
}
