public class bus extends FuelVehicle{
    public int capacity ;
    public bus(String licencePlate  , String fueltype , int capacity){
        super(licencePlate, fueltype);
        this.capacity = capacity ;
    }
    public void refuel(){
        System.out.println("the bus is refueling...");
    }

    @Override
    public void drive() {
        System.out.println("the bus driving");
    }
}
