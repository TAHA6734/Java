class Banka {
    // Static Nested Class: Genel Banka Bilgileri
    static class GenelBilgiler {
        static String bankaAdi = "SuperBank";
        static String merkezSube = "Istanbul";

        static void bankaBilgileriniGoster() {
            System.out.println("Banka Adı: " + bankaAdi);
            System.out.println("Merkez Şube: " + merkezSube);
        }
    }

    // Non-static Inner Class: Müşteri Bilgileri
    class Musteri {
        String isim;
        String hesapNo;
        double bakiye;

        Musteri(String isim, String hesapNo, double bakiye) {
            this.isim = isim;
            this.hesapNo = hesapNo;
            this.bakiye = bakiye;
        }

        void hesapBilgileriniGoster() {
            System.out.println("Müşteri İsmi: " + isim);
            System.out.println("Hesap No: " + hesapNo);
            System.out.println("Bakiye: " + bakiye + " TL");
        }

        void paraCek(double miktar) {
            if (miktar <= bakiye) {
                bakiye -= miktar;
                System.out.println(miktar + " TL çekildi. Yeni bakiye: " + bakiye + " TL");
            } else {
                System.out.println("Yetersiz bakiye!");
            }
        }
    }

    // Local Inner Class: İşlem Yönetimi
    void islemYap(String hesapNo, double miktar) {
        class Islem { // Sadece bu metodun içinde geçerli
            void paraYatir() {
                System.out.println(hesapNo + " numaralı hesaba " + miktar + " TL yatırıldı.");
            }
        }

        Islem islem = new Islem();
        islem.paraYatir();
    }

    // Anonymous Inner Class: Personel Görevi
    public void personelGoreviYap() {
        Personel personel = new Personel() {
            @Override
            public void gorevYap() {
                System.out.println("Personel görevini yapıyor: Gün sonu raporu hazırlanıyor.");
            }
        };
        personel.gorevYap(); // Anonim sınıf kullanımı
    }
}

// Personel Arabirimi (Interface) - Anonim iç sınıf için kullanılacak
interface Personel {
    void gorevYap();
}

public class Main {
    public static void main(String[] args) {
        // Static Nested Class kullanımı
        Banka.GenelBilgiler.bankaBilgileriniGoster();

        // Non-static Inner Class kullanımı (Müşteri oluşturma)
        Banka banka = new Banka();
        Banka.Musteri musteri1 = banka.new Musteri("Ahmet Yılmaz", "123456789", 1000.0);
        musteri1.hesapBilgileriniGoster();

        // Para çekme işlemi
        musteri1.paraCek(200);

        // Local Inner Class kullanımı (Para yatırma işlemi)
        banka.islemYap("123456789", 500);

        // Anonymous Inner Class kullanımı (Personel görevini gerçekleştirme)
        banka.personelGoreviYap();
    }
}
