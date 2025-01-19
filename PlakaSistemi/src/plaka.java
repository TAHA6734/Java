public class plaka implements Comparable<plaka>{

    private int sehirKodu ;
    private String Harfler ;
    private int sayilar ;

    public plaka(int sehirKodu , String harfler , int sayilar){
        if(sehirKodu  < 0 || sehirKodu > 81){
            throw new IllegalArgumentException("Hatali giris 0 ile 81 arasindaki sayilar disinda giris olmaz");
        }
        if(!harfler.matches("[A-Z]{1,3}")){
            throw new IllegalArgumentException("en fazla 3 en az 1 tane harf olmali ve Buyuk harflar olmali");
        }
        if(sayilar  < 0 || sayilar > 999){
            throw new IllegalArgumentException("0-999 arasi sayilar girebilirsiniz");
        }
    }
    public int getSehirKodu(){
        return sehirKodu;
    }
    public String getHarfler(){
        return Harfler;
    }
    public int getSayilar(){
        return  sayilar;
    }
    public int compareTo(plaka p ){
        return Integer.compare(this.sehirKodu , p.sehirKodu);
    }
    public String toString(){
        return sehirKodu  + "  "  + Harfler + "  " + sayilar ;
    }
}
