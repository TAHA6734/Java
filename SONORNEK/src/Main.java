import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<BankAccount>bankAccountList = new ArrayList<>();
        bankAccountList.add(new BankAccount("kasim hoca" , 10000));
        bankAccountList.add(new BankAccount("candir" , 7800));
        bankAccountList.add(new BankAccount("gerisi" , 500));
        bankAccountList.add(new BankAccount("heyecandir" , 4500));

        Collections.sort(bankAccountList);
        for(BankAccount bankAccount : bankAccountList){
            System.out.println(bankAccount);
        }
        Collections.sort(bankAccountList , new NameComparetor());
        for(BankAccount bankAccount : bankAccountList){
            System.out.println(bankAccount);
        }

    }
}