//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        araba araba1 = new araba();

        araba1.setModel("BMW")  ;
        araba1.setKapi(-4);
        araba1.setTekerlek(4);
        araba1.setRenk("Kirmizi");
        araba1.setMotor("V8");

        System.out.println("Arabanin modeli : " + araba1.getModel());
        System.out.println("Arabanin tekerlek sayisi :  :" + araba1.getTekerlek());
        System.out.println("Arabanin  motoru  :" + araba1.getMotor());
        System.out.println("Arabanin  kapilari  :" + araba1.getKapi());
        System.out.println("Arabanin  rengi  :" + araba1.getRenk());



    }
}