public class Motocycle extends Vehicle{
    public String helmetType ;
    public Motocycle(String licencePlate ,String helmetType){
        super(licencePlate);
        this.helmetType = helmetType ;
    }

    @Override
    public void drive() {
        System.out.println("drive a motorcycle with a  : " + licencePlate );
    }
}
