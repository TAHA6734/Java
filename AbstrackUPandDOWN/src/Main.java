
public class Main {
    public static void main(String[] args) {


            Arac arac = new araba();
            Arac arac1 = new otobus();
            Arac arac2 = new traktor();

            upcasting(arac);
            upcasting(arac1);
            upcasting(arac2);

      araba araba = (araba) arac;
      otobus otobus = (otobus) arac1;
      traktor traktor = (traktor) arac2;

      downcasting(arac);
        downcasting(arac1);
        downcasting(arac2);


    }
    public static void upcasting(Arac arac){
        arac.engineOff();
        arac.sound();

    }
    public static void downcasting(Arac arac){
        if(arac instanceof  araba){
            ((araba) arac).sanruf();
        } else if (arac instanceof otobus) {
            ((otobus) arac).kapilar();

        }
        else if (arac instanceof traktor){
            ((traktor) arac).pulluk();
        }
    }

}