public class circle {

    private static double PI = 3.141519;
    private int radius ;

    public void setRadius(int radius){
        this.radius =radius;
    }
    public circle(int radius){
        setRadius(radius);
    }

    public void computeArea(){
        double area = PI*radius*radius;
        System.out.println("Yaricapi " + radius + "olan cemberin alani :  " + area);

    }

}
