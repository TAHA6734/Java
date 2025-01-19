public class Fish extends Animal implements Swimmable{
    public void Swimm(){
        System.out.println("Fish can swim");
    }

    @Override
    public void move() {
        System.out.println("Fish can move ");
    }
}
