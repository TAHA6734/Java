import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    List<BankAccount> myAccounts = new ArrayList<>();

        myAccounts.add(new BankAccount(123 , "Taha" , 58222));
        myAccounts.add(new BankAccount(744 , "Mehmet" , 7852));
        myAccounts.add(new BankAccount(896 , "Sena" , 10256));
        myAccounts.add(new BankAccount(296 , "Basar" , 99660));
        myAccounts.add(new BankAccount(475 , "Sergen" , 896523));

        Collections.sort(myAccounts);

        for(BankAccount account : myAccounts){
            account.balance_chance(500);
        }
        for(BankAccount account : myAccounts){
            System.out.println(account);
        }



    }
}