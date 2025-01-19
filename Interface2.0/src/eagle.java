public class eagle extends Animal implements Flyable{
    public eagle(String name){
        super(name);
    }
    @Override
    public void fly() {
        System.out.println("eagles can only fly ");
    }
}
