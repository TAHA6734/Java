//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static int Ikiilecarp(int a){

            return a * 2 ;
        }

        public static int IkiileTopla(int a ){

            return a+2 ;
        }

        public static int DortileCarp(int a){

            return  a * 4 ;
        }


    public static void main(String[] args) {


        System.out.println("Sonuc "  + DortileCarp(Ikiilecarp(IkiileTopla(8))));

    }
}