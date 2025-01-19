public class Laptop extends Computer implements Discountable{
    private double weight ;
    public Laptop(String brand , String model , double price , double weight){
        super(brand, model, price);
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public String getComputertype(){
        return "LAPTOP";
    }
    public double applyDiscount(double percantage){
        double discoount = getPrice() * (percantage/100);
        setPrice(getPrice() - discoount);
        return getPrice();
    }

}
