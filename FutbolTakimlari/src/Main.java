import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<FootballTeam> teams = new ArrayList<>();

        teams.add(new FootballTeam("Besiktas" , 85 , 100));
        teams.add(new FootballTeam("Fenerbahce" , 84 , 300));
        teams.add(new FootballTeam("Trabzonspor" , 83 , 99));
        teams.add(new FootballTeam("Bursaspor" , 81 , 80));
        teams.add(new FootballTeam("OCGala" , 5 , 10));

        System.out.println("comparator siralamsi ");

        teams.sort(new SpecialCompare());
        for(FootballTeam team : teams){
            System.out.println(team);
        }

        System.out.println("Comparable siralamsi");
        Collections.sort(teams);
        for(FootballTeam team : teams){
            System.out.println(team);
        }

        }
    }
