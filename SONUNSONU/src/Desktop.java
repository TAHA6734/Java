public class Desktop extends Computer implements Discountable{
    private boolean hasMonitor ;
    public Desktop(String brand , String model , double price , boolean hasMonitor){
        super(brand, model, price);
        this.hasMonitor = hasMonitor;
    }
    public boolean isHasMonitor(){
        return hasMonitor;
    }
    public String getComputertype(){
        return "DESKTOP";
    }
    public double applyDiscount(double percantage){
        double discount = (getPrice() * (percantage/100));
        setPrice(getPrice() - discount);
        return getPrice();
    }

}
