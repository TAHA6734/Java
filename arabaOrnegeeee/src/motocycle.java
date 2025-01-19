public class motocycle extends Araclar implements  Drivable , Comparable<motocycle>{
    public boolean hasSideCar ;

    public  motocycle(String brand , int year , boolean hasSideCar){
        super(brand , year);
        this.hasSideCar = hasSideCar ;
    }

    @Override
    public void drive() {
        System.out.println(" motorcycle is drivable ");
    }

    @Override
    public void start() {
        System.out.println(" motorcyc;e is starting ");
    }
public String getbrand(){
        return brand;
}

    public int compareTo(motocycle other){
        return Integer.compare(this.year , other.year);
    }
    public String toString(){
        return  " BRAND : " + brand  + " YEAR " + year + " Side car  " + hasSideCar ;
    }
}
