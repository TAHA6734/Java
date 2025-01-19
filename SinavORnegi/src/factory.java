public class factory {
    car[] cars ;
    public factory(car[] cars){
        this.cars = cars ;
    }
    void printCarInfo(){
        for(car cars : cars){
            System.out.println(cars.printCarInfo());
        }
    }
}
