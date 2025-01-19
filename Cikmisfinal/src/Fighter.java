abstract class Fighter {
    protected String name ;
    protected int health ;

    public Fighter(String  name , int health){
        this.name = name ;
        this.health = health ;
    }
    public abstract void Attackto(Fighter opponent);

    public void defence(){
        this.health -= 10 ;
    }

    public boolean isDead(){
        return this.health <= 0 ;
    }
    public String toString() {
        return name + " (Health: " + health + ")";
    }
}
