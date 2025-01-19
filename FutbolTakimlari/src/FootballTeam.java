import java.util.*;

public class FootballTeam implements Comparable<FootballTeam>{

    private String name ;
    private int points ;
    private int goals ;

    public FootballTeam(String name , int points , int goals){
        this.name = name;
        this.points = points;
        this.goals = goals;
    }

    public String getName(){
        return name;
    }

    public int getPoints(){
        return points;
    }

    public int getGoals(){
        return goals;
    }

    public int compareTo(FootballTeam other){

        int ComparePoints = Integer.compare(this.points , other.points);
        if(ComparePoints != 0 ){
            return ComparePoints;
        }

        int CompareGoals = Integer.compare(this.goals , other.goals);
        if(CompareGoals != 0 ){
            return CompareGoals;
        }

        return Integer.compare(this.name.length() ,other.name.length());

    }
    public String toString() {
        return "FootballTeam{" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", goals=" + goals +
                '}';
    }
}

