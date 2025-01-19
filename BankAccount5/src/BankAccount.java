public class BankAccount implements  Comparable<BankAccount>{
   private int AccountNo ;
   private   String holderName ;
   private  double balance ;

   public BankAccount(int AccountNo , String holderName , double balance){
       this.AccountNo = AccountNo ;
       this.holderName = holderName;
       this.balance = balance;
   }
   public int getAccountNo(){
       return AccountNo ;
   }
   public String getHolderName(){
       return holderName;
   }
   public double getBalance(){
       return  balance;
   }
   public void balance_chance(double amount){
       this.balance-=amount;
   }
   public int compareTo(BankAccount other){
       return this.holderName.compareTo(other.holderName);
   }
   public String toString(){
       return "AccountNo: " + getAccountNo() + ", HolderName: " + getHolderName() + ", Balance: " + getBalance();
   }

}
