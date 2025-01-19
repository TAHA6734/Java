public class square extends rectangle{

    public square(int x , int y , int side){
        super( x , y , side , side );
    }
    public int getSide(){
        return getWeight();
    }
    public void setSide(int side){
        setX(side);
        setY(side);
    }
    public double getArea(){
        return Math.pow(getWeight() , 2 ) ;
    }
}
