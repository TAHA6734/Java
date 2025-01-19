import java.util.Comparator;

public class BRANDCOMPARATOR implements Comparator<Araclar> {
    public int compare(Araclar a1 , Araclar a2){
        return a1.brand.compareTo(a2.brand);
    }
}
