abstract class Araclar {
    protected String brand ;
    protected int year ;

    public Araclar(String brand , int year){
        this.brand = brand;
        this.year = year ;

    }
   public abstract void start();

    public String toString(){
        return " BRAND : " + brand + " YEAR : " + year ;
    }


}
