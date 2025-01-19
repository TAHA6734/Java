public class rectangle {

    private int x ;
    private int y ;
    private int height ;
    private int weight ;

    public rectangle(int x , int y , int height , int weight){
        this.x = x ;
        this.y = y ;
        this.height = height;
        this.weight = weight;
    }

    protected Object getState(){
        return " X : " + x + " Y : "  + y + " Height : " + height + " Weight " + weight ;
    }

    public int getX(){
        return x ;
    }

    public int getY(){
        return y ;
    }

    public int getWeight(){
        return weight;
    }

    public int getHeight(){
        return height;
    }

    public void setX(int x ){
        this.x = x ;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double getArea(){
        return weight*height;
    }
}
