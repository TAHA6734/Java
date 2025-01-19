import java.util.Scanner ;
import java.util.Random;

public class GuessingGame {

    private player player;
    private int targetNumber;
    private int maxAttemps;

    public GuessingGame(player player){
        this.player = player;
        this.maxAttemps = 10 ;
        Random random = new Random();
        this.targetNumber = random.nextInt(100)+1;
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        int attemps  = 0 ;
        boolean isCorrect = false ;

        System.out.println("Oyuna hosgeldin 1-100 arasi bir sayi tutucam bakalim bilebilcek misin ? ");
        System.out.println("10 hakkin var bilemezsen kaybedersin");


        while (attemps < maxAttemps && !isCorrect){
            System.out.println(player.getName() + "tahmin et bakalim\n");
            int guess = scanner.nextInt();
            attemps++;


            if(guess == targetNumber){
                isCorrect = true;
                System.out.println("Tebrikler dogru tahmin ettin " + player.getName());
                player.increamentWins();
            }else if(guess < targetNumber){
                System.out.println("To low man ");
            }else{
                System.out.println("to high");
            }
        }
        if(!isCorrect){
            System.out.println("Maalesef tahminlerin hic biri dogru degil" + player.getName() + "butun hakklarini kullandin dogru sayi " + targetNumber + "idi . ");

        }
        player.increamentGamesPlayed();
    }
    public void display(){
        System.out.println("GAME OVER ");
        System.out.println("GAME PLAYED : " + player.getGamesPlayed());
        System.out.println("GAMES WIN : " + player.getWins());
    }

}
