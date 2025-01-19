import java.util.Comparator;

public class SpecialCompare implements Comparator<FootballTeam>
{
    public int compare(FootballTeam t1 , FootballTeam t2){
        int namecompare = t1.getName().compareTo(t2.getName());
        if(namecompare != 0){
            return namecompare;
        }
        int pointscompare = Integer.compare(t1.getGoals() , t2.getGoals());
        if(pointscompare != 0){
            return pointscompare;
        }

        return Integer.compare(t1.getPoints() , t2.getPoints());
    }
}
