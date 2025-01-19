public class car extends FuelVehicle{
    public int doors ;
    public car(String licencePlate ,String fuelType ,int doors){
        super(licencePlate , fuelType);
        this.doors = doors;
    }
    public void refuel(){
        System.out.println("The car is refueling");
    }

}
