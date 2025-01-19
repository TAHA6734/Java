public class player {

    private String isim;
    private int wins;
    private int GamesPlayed;

    public player(String isim ){
        this.isim = isim;
        this.wins=0;
        this.GamesPlayed = 0 ;
    }

    String getIsim(){
        return isim;
    }
    int getWins(){
        return wins;
    }
    int getGamesPlayed(){
        return GamesPlayed;
    }

    public void increamentWin(){
        wins++;
    }
    public void increamentGamesPlayed(){
        GamesPlayed++;
    }

}
