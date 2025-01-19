import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {

    private player player;
    private String[] options = {"Rock" , "Paper" , "Scissors"};


public RockPaperScissorsGame(player player){
    this.player = player;
}

public void startGame(){

Scanner scanner = new Scanner(System.in);
Random random = new Random();

System.out.println("Welcome to Rock Paper Scissors game \n ");
System.out.println("Choose one of them 1.Rock 2.Paper 3.Scissors");

String choice = scanner.nextLine();
String computerChoice = options[random.nextInt(options.length)];

if(choice.equalsIgnoreCase(computerChoice)){
    System.out.println("its tie!!");
} else if (choice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")||
choice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")||
    choice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
{
    System.out.println("congratulations " + player.getIsim()+"Wins");

}
else{
    System.out.println("You lost man...");
}
player.increamentGamesPlayed();



}

public void display(){
    System.out.println(player.getIsim() + "wins : " + player.getWins());
    System.out.println(player.getIsim() + "games played" + player.getGamesPlayed());
    System.out.println("Game over fuck off ");
}



}
