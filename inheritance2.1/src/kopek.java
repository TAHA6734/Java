public class kopek extends  hayvan{

private int dis_sayisi;

public kopek(String isim , int kilo , int boy , int bacak_sayisi , int dis_sayisi)
{
    super(isim , kilo,boy,bacak_sayisi);
    this.dis_sayisi = dis_sayisi;
}

public void setDis_sayisi(int dis_sayisi){
    this.dis_sayisi = dis_sayisi;

}
public int getDis_sayisi(){
    return dis_sayisi;
}

public void harekete_gec(int hiz){
    System.out.println("kopek "  + hiz  + " ile hareket ediyor");
}

   public void kos(int hiz){

   harekete_gec(hiz);

}
}

