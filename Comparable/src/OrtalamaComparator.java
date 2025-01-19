import java.util.Comparator;

class OrtalamaComparator implements Comparator<ogrenci> {
    public int compare(ogrenci o1 , ogrenci o2){
        return Double.compare(o1.getOrtalama() , o2.getOrtalama());
    }
}