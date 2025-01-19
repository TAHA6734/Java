//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();

        Hesap hesap1 = new Hesap("TAHA KAYRA TEKIN", "123456", 55000) ;

        atm.calis(hesap1);

        System.out.println("Programdan Cikiliyor...");
    }
}