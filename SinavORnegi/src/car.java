public class car {

    String brand ;
    int year;
    int maxSpeed;

    public car(String brand , int year , int maxSpeed){
       this.year = year;
       this.brand = brand;
       this.maxSpeed = maxSpeed;
    }
    car(String brand , int year){

        this.brand = brand;
        this.year = year;
        maxSpeed = 320 ;
    }
    car(int year){
        this.year = year;
        maxSpeed = 258;
        brand = "BMW";
    }
    public  void setBrand(){
        this.brand = brand;
    }
    public void setYear(){
        if(year > 2022){
            throw new IllegalArgumentException("HATALI GIRIS");
        }
        else{
            this.year = year;
        }
    }
    public void setMaxSpeed(){
        this.maxSpeed = maxSpeed;
    }

    public String getBrand(String brand){
        return brand;
    }
    public int getYear(int year){
        return  year;
    }
    public int getMaxSpeed(int maxSpeed){
        return maxSpeed;
    }
    public String  printCarInfo(){
        return String.format("brand  = " + this.brand +  "year  = " + this.year + "max speed " + this.maxSpeed);
    }


}
