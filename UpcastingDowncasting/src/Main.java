public class Main{
    public static void main(String[] args){

        Hayvan hayvan1 = new Kedi();
        Hayvan hayvan2 = new Kopek();
        Hayvan hayvan3 = new Tavuk();

        hayvan1.ses_cikar();
        hayvan2.ses_cikar();
        hayvan3.ses_cikar();

        Kopek kopek = (Kopek) hayvan1;
        Kedi kedi = (Kedi) hayvan2;

        kopek.Kopek_hav();
        kedi.kedi_miyav();



    }
}


