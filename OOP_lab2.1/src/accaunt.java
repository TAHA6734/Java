
import  java.util.Scanner ;


public class accaunt {

    private double balance ;
    private String owner_name ;
    private String password ;

    Scanner scanner = new Scanner(System.in);


    accaunt(double balance  , String owner_name , String password){

        this.balance = balance ;
        this.owner_name = owner_name ;
        this.password = password;
    }

    public void setBalance(double balance){
        this.balance = balance ;
    }

    public double getBalance(){
        return balance ;
    }

    public void setOwner_name(String owner_name){
        this.owner_name = owner_name ;
    }

    public String getOwnerName(){
        return owner_name;
    }

    public void  setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }


    public void Add_money(){

        System.out.println("How much money do you want to add ? ");
        double amount  = scanner.nextDouble();
        balance += amount;
        System.out.println("Your new balance is  : " + balance);


    }

    public void Withdraw_money(){

        System.out.println("how much money do you want to withdraw ? ");

        double amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("ERROR 313 : you can just withdraw money that you have in your account " + balance);

        }
        else {
            balance -= amount ;

        }
        System.out.println("your new balance is : " + balance);

    }

    public boolean Security() {

        System.out.println("enter your password ");

        int hakk = 3;
        while (hakk > 0) {
            String inputpassword = scanner.nextLine();

            if (this.password.equals(inputpassword)) {
                System.out.println("your password is correct");
                return true;
            } else {
                System.out.println("your password is incorrect");
                hakk--;
                System.out.println("You can try " + hakk + "more");

            }
            if (hakk == 0)
                System.out.println("YOUR account has been block please go to nearsest bank");
            return false;
        }
        return false ;
    }
}


