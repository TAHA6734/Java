public class Kibishli extends  Fighter implements  judoAttack{

    public  Kibishli(String name , int health){
        super(name , health);
    }

    @Override
    public void judoAttack(Fighter opponent) {
        opponent.health -= 15 ;
    }

    @Override
    public void Attackto(Fighter opponent) {
        judoAttack(opponent);
    }
}
