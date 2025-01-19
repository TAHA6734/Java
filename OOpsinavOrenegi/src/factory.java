public class factory {

car[] cars ;

public factory(car[] cars){
    this.cars = cars;
}
void printAllCars(){
   for(car cars : cars){
       System.out.println(cars.GetcarInfo());
   }
}

}
