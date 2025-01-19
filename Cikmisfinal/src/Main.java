import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fighter kibish = new Kibishli("BakuganPegasus" , 100 ) ;
        Fighter Hybrid =  new Hybrid("Polat alemdar " , 999 );

        boolean isDead = false ;

        while (!isDead){
            kibish.Attackto(Hybrid);
            if(Hybrid.isDead()){
                System.out.println(Hybrid.name + " is dead ");
                isDead = true ;
                break;
            }
            Hybrid.Attackto(kibish);
            if(kibish.isDead()){
                System.out.println(kibish.name + "is dead ");
                isDead = true ;
                break;
            }

            kibish.defence();
            Hybrid.defence();
        }

        System.out.println(kibish);
        System.out.println(Hybrid);

    }
}