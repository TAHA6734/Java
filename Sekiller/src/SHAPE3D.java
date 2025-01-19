abstract class SHAPE3D extends SHAPE2D {
    double deptht ;
    public SHAPE3D(double height , double widght , double deptht){
        super(height, widght);
        this.deptht = deptht ;
    }
    public abstract double getVolume();
    public String toString(){
        return " the volume "  ;
    }

}
