import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        accaunt accaunt1 = new accaunt(55000.000 , "TAHA KAYRA TEKIN " , "123456") ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO ZIAAT BANK ");
        System.out.println("YOUR BALANCE : " + accaunt1.getBalance());

            if(!accaunt1.Security()){
                return;
            }


        while (true){


            String islemler = "1.ADD MONEY \n "
                    + "2.WITHDRAW MONEY \n "
                    + "q quit \n";
            System.out.println(islemler);
            System.out.println("Your Name : " + accaunt1.getOwnerName());


            String choice = scanner.nextLine() ;
            if(choice.equals("1")){

                accaunt1.Add_money();
                System.out.println("your new balance :  "+accaunt1.getBalance());

            }
            else if(choice.equals("2")){
                accaunt1.Withdraw_money();
                System.out.println("your new balance :  "+accaunt1.getBalance());

            }
            else if(choice.equals("q")){
                break;
            }
            else {
                System.out.println("Chose a valuable choice...");
            }

        }
    }
}