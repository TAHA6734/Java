import java.util.Comparator;

class IsmegoreComparator implements Comparator<ogrenci> {
    public int compare(ogrenci o1 , ogrenci o2){
        return o1.getIsim().compareTo(o2.getIsim()) ;
    }
}
