abstract class FuelVehicle extends Vehicle{

    public String fueltype ;

    public FuelVehicle(String licencePlate  , String fueltype){
        super(licencePlate);
        this.fueltype = fueltype ;
    }

    public abstract void refuel();

    public void drive(){
        System.out.println("Drive the car " + licencePlate + "is available ");
    }



}
