public class Item {
    private String isim ;
    private int weight ;

    public Item(String isim , int weight){
        this.isim = isim;
        this.weight =weight;
    }
    public String getIsim(){
        return isim;
    }
    public int getWeight(){
        return weight;
    }
}
