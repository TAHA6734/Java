//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            KibishliFighter fighter1 = new KibishliFighter(" DELI HUSNU " , 100);
            Hybridfighter fighter2 = new Hybridfighter(" POKEMON ALEMDAR " , 900 );
            boolean isDead = false ;
            while(true){
                fighter1.JudoAttackTo(fighter2);
                if(fighter2.isDead(isDead) == true){
                    break;
                }
                fighter2.boxingAttackTo(fighter1);
                if(fighter1.isDead(isDead) == true){
                    break;
                }

                fighter2.defence();
                fighter1.defence();
            }

    }
}