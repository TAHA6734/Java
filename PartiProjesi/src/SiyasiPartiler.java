public class SiyasiPartiler  implements  Comparable<SiyasiPartiler>{
    private String name ;
    private double oyYuzdesi ;
    private  int ondeSehir ;

    public SiyasiPartiler(String name , double oyYuzdesi , int ondeSehir){
        this.name = name;
        this.oyYuzdesi = oyYuzdesi;
        this.ondeSehir = ondeSehir ;
    }
    public String getName(){
        return name ;
    }
    public double getOyYuzdesi(){
        return oyYuzdesi;
    }
    public int getOndeSehir(){
        return ondeSehir;
    }
    public int compareTo(SiyasiPartiler parti){
        return  Double.compare(parti.oyYuzdesi , this.oyYuzdesi);
    }
    public String toString() {
        return "Parti: " + name + ", Oy Yüzdesi: " + oyYuzdesi + "%, Önde Olduğu Şehirler: " + ondeSehir;
    }
}
