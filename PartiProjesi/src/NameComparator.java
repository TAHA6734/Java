import java.util.Comparator;

public class NameComparator implements Comparator<SiyasiPartiler> {
        public int compare(SiyasiPartiler parti1 , SiyasiPartiler parti2){
            return parti1.getName().compareTo(parti2.getName());
        }

}


