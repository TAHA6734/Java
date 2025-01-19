//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        circle c1 = new circle();
        circle c2 = new circle(3.0);
        circle c3 = new circle(3.0 , 5.0);
        circle c4 = new circle("black" , 5.2 , 3.0);
        
        c1.printfInfo();
        System.out.println(c1.getVolume());
        c2.printfInfo();
        System.out.println(c2.getVolume());
        c3.printfInfo();
        System.out.println(c3.getVolume());
        c4.printfInfo();
        System.out.println(c4.getVolume());


    }
}