public class Cat extends Animal implements Moveable{
    public Cat(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("cats can only move");
    }
}
