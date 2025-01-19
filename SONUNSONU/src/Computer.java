import java.util.SplittableRandom;

abstract class Computer {
    private String brand ;
    private String model ;
    private double price ;
    public Computer(String brand , String model , double price){
        this.brand = brand;
        this.model = model ;
        this.price = price ;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public double getPrice(){
        return price ;
    }
    public void setPrice(double price){
        this.price = price ;
    }
    public abstract String getComputertype();
}
