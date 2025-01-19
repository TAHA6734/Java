//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

hero hero1 = new hero("FATIH SULTAN MEHMET" , 100  );
hero hero2 = new hero("METEHAN" , 1000);

weapon weapon1 = new weapon("ak-47" , 50);
weapon weapon2 = new weapon("bazuka" , 500) ;

hero1.silah_kusanma(weapon1);
hero2.silah_kusanma(weapon2);

hero1.attack();
hero2.attack();


    hero.ShowtotalHeros();

    }
}