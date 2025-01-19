public class car {
    private String brand ;
    private int year ;
    private int max_speed ;

    public car(String brand){
        this(brand,2022,180);
    }
    public car(String brand , int year){
        this(brand,year,300);
    }
    public car(String brand , int year , int max_speed){
        setBrand(brand);
        setYear(year);
        setMax_speed(max_speed);
    }
        public void setBrand(String brand){
        this.brand = brand;
        }
        public void setYear(int year)throws IllegalArgumentException {
        if(year > 2025){
            throw new IllegalArgumentException("Illehal year");
        }
            else{
               this.year = year;
        }
        }
        public void setMax_speed(int max_speed){
        this.max_speed= max_speed;
        }

        public String getBrand(){
        return brand;
        }

        public int getYear(){
        return  year;
        }

        public int getMax_speed(){
        return max_speed;
        }

        public String GetcarInfo(){
            return String.format("BRAND: %s YEAR: %d  SPEED: %d",
                    this.brand, this.year, this.max_speed);
        }

}
