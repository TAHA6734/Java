
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        isci Isci1 = new isci("TAHA KAYRA" , 123465 , 550000 , 12.5);

        Isci1.Salary();
        Isci1.Display_info();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Isminizi girin : ");
        String name = scanner.nextLine();
        System.out.println("ID girin : ");
        int Id  = scanner.nextInt();
        System.out.println("Maas girin : ");
        int Maas   = scanner.nextInt();
        System.out.println("calisma saatini girin : ");
        double working_hours   = scanner.nextDouble();


        isci Isci2 = new isci(name, Id, Maas, working_hours);

        Isci2.Display_info();
        Isci2.Salary();

        scanner.close();


    }
}