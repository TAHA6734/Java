public class player {

    private String name ;
    private int gamesPlayed ;
    private int wins ;


    public player(String name){

        this.name = name;
        this.wins = 0 ;
        this.gamesPlayed = 0 ;

    }

    int getWins(){
        return wins;
    }
    int getGamesPlayed(){
        return gamesPlayed;
    }
    String getName(){
        return name;
    }

    public void increamentWins(){
        wins++;
    }
    public void increamentGamesPlayed(){
        gamesPlayed++;
    }
}
