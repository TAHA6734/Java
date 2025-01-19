public class Duck extends Animal implements Swimmable,Flyable{
    @Override
    public void move() {
        System.out.println("Duck can move");
    }

    @Override
    public void Fly() {
        System.out.println("duck can fly");
    }

    @Override
    public void Swimm() {
        System.out.println("Duck can swim");
    }
}
