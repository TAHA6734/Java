class AnlamsizNotGirisi extends Exception{
    public AnlamsizNotGirisi(String mesaj){
        super(mesaj);
    }
}

enum day{
    pazartesi("hafta ici"),
    sali("hasta ici"),
    carsamba("hafta ici"),
    persembe("hafta ici"),
    cuma("hafta ici"),
    cumartese("hafta sonu"),
    pazar("hafta sonu");

    private String type ;

     day(String type){
        this.type =type;
    }
    public String getType(){
         return type;
    }
}


public class Main {
    public static void main(String[] args) {
        try {
            student std1 = new student(50  , "TAHA KAYRA");
            student std2 = new student(110 , "ali");
        }catch (AnlamsizNotGirisi e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("notlar girildi");
        }
    }
}