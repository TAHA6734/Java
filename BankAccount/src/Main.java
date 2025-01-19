import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<BankAccount>bankAccounts = new ArrayList<BankAccount>() ;

       BankAccount bankAccount1 = new BankAccount(123 , "TAHA" , 1000);
       BankAccount bankAccount2 = new BankAccount(124 , "KAYRA" , 1500);
       BankAccount bankAccount3 = new BankAccount(125 , "TEKIN" , 2500);
        BankAccount bankAccount4 = new BankAccount(125 , "KARAKARTAL" , 2500);

        bankAccounts.add(bankAccount1);
        bankAccounts.add(bankAccount2);
        bankAccounts.add(bankAccount3);
        bankAccounts.add(bankAccount4);

        Collections.sort(bankAccounts);

        for(BankAccount bankAccount : bankAccounts){
            System.out.println(bankAccount);
        }

        for (BankAccount bankAccount : bankAccounts) {
            bankAccount.BalanceChange(500);  // artık dönüş değeri olmadığı için sadece çağrılıyor
            System.out.println(bankAccount);  // Yeni bakiyeyi yazdırıyoruz
        }
    }
}