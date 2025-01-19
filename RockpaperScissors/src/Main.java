//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        player player = new player("Taha kayra") ;
        RockPaperScissorsGame game = new RockPaperScissorsGame(player);
        game.startGame();
    }
}