

public class BankAccount implements Comparable<BankAccount> {
    public String name ;
    public double balance ;

    public BankAccount(String name , double balance){
        this.name = name ;
        this.balance = balance ;
    }
    public double balanceChange(double amount){
        return balance-=amount;
    }
    public double getBalance(){
        return balance ;
    }
    public int compareTo(BankAccount other) {
        return Double.compare(this.balance , other.balance);
    }

    public String toString(){
        return " name "  + name + " balance "  + balance ;
    }
}
