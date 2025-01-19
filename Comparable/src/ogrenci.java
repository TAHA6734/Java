
public class ogrenci implements Comparable<ogrenci>{
    private int numara ;
    private double ortalama;
    private String isim;

    public ogrenci(int numara , double ortalama , String isim){
        this.numara = numara;
        this.ortalama = ortalama;
        this.isim = isim;
    }

    public int getNumara(){
        return numara;
    }

    public double getOrtalama() {
        return ortalama;
    }
    public String getIsim(){
        return isim;
    }

    public String toString(){

        return "isim : " + isim + " ortalama : " + ortalama + "numara  : " + numara ;
    }
    public int compareTo(ogrenci other){
        return Integer.compare(this.numara , other.numara);
    }

}

