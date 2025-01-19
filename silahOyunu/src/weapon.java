public class weapon {
   private String isim ;
    private int damage;


    public weapon(String isim , int damage ){
        this.damage= damage;
        this.isim = isim;
    }
    public String getIsim(){
        return isim;
    }
    public int getDamage(){
        return damage;
    }
}
