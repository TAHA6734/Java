public class Hybrid extends Fighter implements boxingAttack,muathaiAttack{
    public Hybrid(String name , int health){
        super(name , health);
    }

    @Override
    public void boxingAttack(Fighter opponent) {
        opponent.health -= 20 ;
    }

    @Override
    public void muathaiAttack(Fighter opponent) {
        opponent.health -= 25 ;
    }

    @Override
    public void Attackto(Fighter opponent) {
        muathaiAttack(opponent);
    }
}
