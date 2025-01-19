import java.util.Comparator;
public class NameComparetor implements Comparator<BankAccount> {
    public int compare(BankAccount b1 , BankAccount b2){
        return b1.name.compareTo(b2.name);
    }

}

