import java.util.Comparator;

public class arackiyasla implements Comparator<plaka> {

    public int compare(plaka a1 , plaka a2){
        int sehirKarsilastirmasi = Integer.compare(a1.getSehirKodu() , a2.getSehirKodu());
        if(sehirKarsilastirmasi != 0){
            return sehirKarsilastirmasi;
        }
        String harfler1 = a1.getHarfler();
        String harfler2 = a2.getHarfler();

        char ikinciharf1 = harfler1.length() > 1 ? harfler1.charAt(1) : harfler1.charAt(0);
        char ikinciharf2 = harfler2.length() > 1 ? harfler2.charAt(1) : harfler2.charAt(0);

        int harfkarsilasmasi = Character.compare(ikinciharf1 , ikinciharf2);

        if(harfkarsilasmasi != 0 ){
            return harfkarsilasmasi;
        }

        return Integer.compare(a1.getSayilar() , a2.getSayilar());
    }

}
