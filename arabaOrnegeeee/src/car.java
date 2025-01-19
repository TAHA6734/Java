public class car extends Araclar implements Drivable ,Comparable<car>{

    public int doors ;

    public car(String brand , int year , int doors){
        super(brand, year);
        this.doors = doors;
    }
    public void start(){
        System.out.println(" car is starting ...");
    }
    public void drive(){
        System.out.println("car is drivable ");
    }
    public int getYear(){
        return year;
    }
    public int compareTo(car other){
        return Integer.compare(this.getYear() , other.getYear());
    }
    public String toString(){
        return " BRAND : " + brand  + " YEAR " + year + " DOORS " + doors ;
    }

}
