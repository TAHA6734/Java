import java.sql.SQLOutput;

public class Duck extends Animal implements Moveable , Swimmable , Flyable{
    public Duck(String name){
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("duck can fly");
    }

    @Override
    public void move() {
        System.out.println("duck can move");
    }

    @Override
    public void swimm() {
        System.out.println("Duck can fly");
    }
}
