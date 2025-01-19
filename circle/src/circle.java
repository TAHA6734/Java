public class circle {
    private String color ;
    private double height ;
    private double radius ;


    public circle(String color , double height , double radius){
        setColor(color);
        setHeight(height);
        setRadius(radius);
    }
    circle(double radius){
        this("unknown", 0 , radius);
    }
    circle(double height , double radius){
        this("unkown",height ,radius);
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setHeight(double height){
        this.height =height;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public double getHeight(){
        return height;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getVolume(){
        return getArea() * height;
    }
    public String printfInfo(){
        return String.format("radius : " + this.radius + "color : " + this.color + "height : " + this.height);
    }
}
