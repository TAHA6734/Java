public class BankAccount implements Comparable<BankAccount> {
    public int accountNo ;
    public String holderName ;
    public double Balance ;

    public BankAccount(int accountNo , String holderName , double balance){
        this.accountNo = accountNo ;
        this.holderName = holderName ;
        this.Balance = balance ;
    }
    public double BalanceChange(double amount){
        return this.Balance -= amount ;
    }

   public int compareTo(BankAccount other){
        return this.holderName.compareTo(other.holderName);

   }

    public double getBalance(){
        return Balance;
    }
    public String toString(){
        return " NAME : " + holderName + " ACCOUNT NO : " + accountNo + "BALANCE " + getBalance() ;
    }

}
