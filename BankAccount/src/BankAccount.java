public class BankAccount implements Comparable<BankAccount> {

     public int AccountNo ;
     public String Holdername;
     public double balance ;

     public BankAccount(int AccountNo , String Holdername , double balance){
         this.AccountNo = AccountNo;
         this.Holdername = Holdername;
         this.balance = balance ;
     }

     public double BalanceChange(double amount){
         return balance -= amount ;
     }
     public String getHoldername(){
         return Holdername ;
     }

     public int compareTo(BankAccount other){
         if (this.Holdername == null || other.Holdername == null) {
             return 0; // veya uygun bir şekilde sıralama yapabilirsiniz
         }
         return this.getHoldername().compareTo(other.getHoldername());
     }
     public String toString(){
         return " holder name : " + Holdername + " Account No : " + AccountNo + " balance " + balance ;
     }

}
