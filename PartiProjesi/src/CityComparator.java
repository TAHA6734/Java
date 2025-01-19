import java.util.Comparator;

public class CityComparator implements Comparator<SiyasiPartiler> {
    public int compare(SiyasiPartiler parti1  , SiyasiPartiler parti2){
        return Integer.compare(parti1.getOndeSehir() , parti2.getOndeSehir());
    }
}

