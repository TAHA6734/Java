import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args ){
        List<BankAccount>bankAccounts = new ArrayList<BankAccount>();
        bankAccounts.add(new BankAccount(123 , " TAHA " , 1000)) ;
        bankAccounts.add(new BankAccount(125 , " KAYRA " , 85000));
        bankAccounts.add(new BankAccount(780 , " TEKIN " , 75000));
        bankAccounts.add(new BankAccount(700 , " CUMALI " , 9000));

        for(BankAccount bankAccount : bankAccounts){
            bankAccount.BalanceChange(500);
        }
        Collections.sort(bankAccounts);
        for (BankAccount bankAccount : bankAccounts){
            System.out.println(bankAccount);
        }
    }
}