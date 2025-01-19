public class Hybridfighter extends  Fighter implements  BoxingAttackBehavior , MuaThaiAttackBehavior{
    public Hybridfighter(String name , int health){
        super(name , health);
    }
    public Fighter attackTo(Fighter opponent){
        opponent.health -= 10 ;
        return  opponent ;
    }
    public Fighter boxingAttackTo(Fighter opponent){
        opponent.health -= 100 ;
         return opponent;
    }
    public Fighter MuaThaiAttackTo(Fighter opponent){
        opponent.health -= 25 ;
        return  opponent ;
    }
    public void defence(){
        System.out.println(" THE HEALTH IS  " + (this.health + 25));
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
