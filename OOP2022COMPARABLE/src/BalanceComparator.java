import java.util.Comparator;

public class BalanceComparator implements Comparator<BankAccount> {
    public int compare(BankAccount b1 , BankAccount b2){

        return Double.compare(b1.getBalance() , b2.getBalance());
    }
}

