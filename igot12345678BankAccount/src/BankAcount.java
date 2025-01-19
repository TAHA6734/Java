public class BankAcount implements Comparable<BankAcount>{
    public int accountNo ;
    public String holderName ;
    public double balance ;

    public BankAcount(int accountNo , String holderName , double balance){
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }
    public void balanceChange(double amount){
        System.out.println(" Old balance : " + balance  + " new balancec : " + (float)(balance-= amount));
    }
    public int compareTo(BankAcount other){
        return this.holderName.compareTo(other.holderName);
    }
    public String toString(){
        return " name : " + holderName + "account no : " + accountNo + " balance : " + balance ;
    }

}
