import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

       try {
           worker worker1 = new worker("TAHA KAYRA TEKIN" , 550000) ;
           System.out.println(worker1.getName() + " has salary : " + worker1.getSalary());
           worker worker2 = new worker("MUSTAFA FURKAN EKSI" , 17002) ;
           System.out.println(worker2.getName() + " has salary : " + worker2.getSalary());
           worker worker3 = new worker("BARAN MERT EREN" , -99999999) ;
           System.out.println(worker3.getName() + " has salary : " + worker3.getSalary());


       }catch (InputMismatchException e ){
           System.out.println("HATA YAKALNDI" + e.getMessage());
       }
       finally {
           System.out.println("TOPLAM ISCI SAYISI" + worker.getCounter());
       }







    }
}