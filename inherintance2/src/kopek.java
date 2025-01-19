public class kopek extends hayvan{

    private int dis_Sayisi ;

    public kopek(String isim , int kilo , int boy , int bacak_sayisi , int dis_Sayisi)
    {
        super(isim, kilo, boy, bacak_sayisi);
        this.setDis_Sayisi(dis_Sayisi);
    }

    public int getDis_Sayisi() {
        return dis_Sayisi;
    }

    public void setDis_Sayisi(int dis_Sayisi) {
        this.dis_Sayisi = dis_Sayisi;
    }

    public void kosuyor(int hiz){
        super.hareketeGec(hiz);
    }
}
