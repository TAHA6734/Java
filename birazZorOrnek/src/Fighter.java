abstract class Fighter {
    protected String name ;
    protected int health ;
    public Fighter(String name , int health){
        this.name = name ;
        this.health = health ;
    }
   abstract Fighter attackTo(Fighter opponent);
   abstract void defence();


}
