public class Duck extends Animal implements Swimmable , Flyable{
    public void move(){
        System.out.println(" ordek hareket eder ");
    }

    @Override
    public void fly() {
        System.out.println("ordek ucar ");
    }

    @Override
    public void swimm() {
        System.out.println("ordek yuzer ");
    }
}
