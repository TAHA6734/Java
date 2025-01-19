public class ogrenci {
    private String isim ;
    private double ortalama ;

    public ogrenci(String isim , double ortalama){
        this.isim = isim;
        this.ortalama = ortalama;
    }

    public String getIsim(){
        return isim;
    }

    public double getOrtalama() {
        return ortalama;
    }

    public boolean equals(Object obj){
        if(this == obj)return true;

        if(obj == null || getClass() != obj.getClass())return false;

        ogrenci ogrenci = (ogrenci) obj;

        return Double.compare(ogrenci.ortalama , ortalama) == 0 && isim.equals(ogrenci.isim);

    }

    public String toString(){
        return " isim " + isim + " Ortalama " + ortalama ;
     }

    public int hashCode() {
        // HashSet gibi veri yapılarında tutarlı çalışması için hashCode da override edilmeli
        return isim.hashCode() + Double.valueOf(ortalama).hashCode();
    }

}
