abstract class SHAPE2D {
    static final double PI = 3.14 ;
    double height ;
    double widght ;
    double radius ;

    public SHAPE2D(double height , double widght){
        this.height = height;
        this.widght = widght;
    }

    public SHAPE2D(double radius){
        this.radius = radius ;
    }

    public abstract double getArea();

    public String toString(){
        return " THE AREA " ;
     }


}
