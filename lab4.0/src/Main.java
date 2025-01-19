
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Programa hoşgeldin, çıkış için 'q'ya basın. Devam etmek için birinci sayıyı giriniz:");
            System.out.print("Birinci sayı: ");
            String inputA = scanner.nextLine();
            if (inputA.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            int a;
            try {
                a = Integer.parseInt(inputA); // Girişi int'e dönüştür
            } catch (NumberFormatException e) {
                System.out.println("HATA: Geçerli bir tam sayı girmediniz.");
                continue; 
            }

            System.out.print("İkinci sayı: ");
            String inputB = scanner.nextLine();
            if (inputB.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            int b;
            try {
                b = Integer.parseInt(inputB);
            } catch (NumberFormatException e) {
                System.out.println("HATA: Geçerli bir tam sayı girmediniz.");
                continue;
            }

            try {
                divide(a, b);
            }
            catch (ArithmeticException e) {
                System.out.println("HATA: " + e.getMessage());
            }
            finally {
                System.out.println("Program sonlandı.");
            }
        }

        scanner.close();
    }

    public static void divide(int num1, int num2) throws ArithmeticException {

         if (num2 == 0) {
            throw new ArithmeticException("Bu bir ArithmeticException hatasıdır.");
        } else {
            System.out.println("SONUÇ: " + (num1 / num2));
        }
    }
}
