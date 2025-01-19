public class hero {

    private String isim;
    private int health;
    private static int totalheros = 0;
    private weapon weapon;

    public hero(String isim, int health) {
        this.health = health;
        this.isim = isim;
        totalheros++;
    }

    public static void ShowtotalHeros() {
        System.out.println(totalheros);
    }

    public void silah_kusanma(weapon weapon) {
        this.weapon = weapon;
        System.out.println(isim + " " + weapon.getIsim() + " " + "kusandi");
    }

    public void attack() {
        if (weapon != null) {
            System.out.println(isim + " " + weapon.getIsim() + " " + "ile saldiriyor Hasari : " + " " + weapon.getDamage());
        } else {
            System.out.println(isim + " " + "silahi yok");
        }
    }


}