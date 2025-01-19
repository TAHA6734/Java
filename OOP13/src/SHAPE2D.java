 public abstract class SHAPE2D {
    protected double height ;
    protected double widht ;
    protected double radius ;
    public static final double PI = 3.14159;

    public abstract double getArea();

    public SHAPE2D(double radius){
        this.radius = radius;
    }
    public SHAPE2D(double height , double widht){
        this.widht = widht ;
        this.height = height ;
    }
    public String toString(){
        return "Height: " + height + ", Width: " + widht + ", Radius: " + radius;
    }
}
