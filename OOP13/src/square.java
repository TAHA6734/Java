public class square extends SHAPE2D{
    public square(double widht){
        super(0 , widht);
    }

    @Override
    public double getArea() {
        return widht * widht;
    }
}
