public abstract class SHAPE3D extends SHAPE2D{
    protected double depht ;
    public SHAPE3D(double height , double widht , double depht){
        super(height, widht);
        this.depht = depht;
    }
     SHAPE3D(double height , double radius , double depht){
        super(radius);
        this.depht = depht;
    }


    public abstract double getArea();

    public String toString(){
        return super(toString())
    }
}
