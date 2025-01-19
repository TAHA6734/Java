public class KibishliFighter extends Fighter implements JudoAttackBehavior{
    public KibishliFighter(String name , int health){
        super(name, health);
    }
    public Fighter attackTo(Fighter opponent){
        opponent.health -= 10 ;
        return opponent ;
    }
       public Fighter JudoAttackTo(Fighter opponent){
           opponent.health -=50 ;
           return opponent;
       }
       public void defence(){
           System.out.println(" THE HEALTH IS NOW " + (this.health + 20));
       }
       public boolean isDead(boolean isDead){
        if(!isDead){
            return true;
        }
        else{
            return false ;
        }
       }

}
