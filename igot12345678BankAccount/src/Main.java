import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<BankAcount>bankAcountList = new ArrayList<BankAcount>();
        bankAcountList.add(new BankAcount(123 , " RAFA SILVA " , 1000));
        bankAcountList.add(new BankAcount(125 , " IMMOBILE " , 2500));
        bankAcountList.add(new BankAcount(126 , " PAULISTA " , 9000));
        bankAcountList.add(new BankAcount(129 , " SERGEN YALCIN  " , 900000));

        Collections.sort(bankAcountList);
        for(BankAcount bankAcount : bankAcountList){
            System.out.println(bankAcount);
        }
        for(BankAcount bankAcount : bankAcountList){
            bankAcount.balanceChange(500);
        }
    }
}