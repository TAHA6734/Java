public class test {

    public static void main(String[] args){

        account account1 = new account();

        account account2 = new account("TAHA KAYRA TEKIN","789466","456258",55.000,"ttahakayra@gmail.com");

        account account3 = new account("AHMET TEKIN","789852654","8509986352",0.0,"Bilgi Yok");

        account1.BilgiGoster();
        account2.BilgiGoster();
        account3.BilgiGoster();




    }
}
