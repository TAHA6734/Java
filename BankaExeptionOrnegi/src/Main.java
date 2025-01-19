// 1. Kendi Exception sınıfımızı oluşturalım (Özel bir istisna)
class YetersizBakiyeException extends Exception {
    public YetersizBakiyeException(String mesaj) {
        super(mesaj); // Exception mesajını üst sınıfa (Exception'a) geçir
    }
}

class BankaHesabi {
    private String hesapNo;
    private double bakiye;

    public BankaHesabi(String hesapNo, double bakiye) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
    }

    // 2. throws: Bu metot YetersizBakiyeException fırlatabilir
    public void paraCek(double miktar) throws YetersizBakiyeException {
        // 3. throw: Yetersiz bakiye durumunda özel bir istisna fırlatalım
        if (miktar > bakiye) {
            throw new YetersizBakiyeException("Yetersiz bakiye! Çekmek istediğiniz miktar: "
                    + miktar + ", Mevcut bakiye: " + bakiye);
        } else {
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi. Yeni bakiye: " + bakiye + " TL");
        }
    }

    // Para yatırma metodu (istisna fırlatmıyor)
    public void paraYatir(double miktar) {
        if (miktar <= 0) {
            // 4. throw: Negatif bir miktar yatırmak istendiğinde IllegalArgumentException fırlatabiliriz
            throw new IllegalArgumentException("Yatırılacak miktar pozitif olmalı!");
        } else {
            bakiye += miktar;
            System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + bakiye + " TL");
        }
    }

    public double getBakiye() {
        return bakiye;
    }
}

public class Main {
    public static void main(String[] args) {
        // Yeni bir banka hesabı oluşturalım
        BankaHesabi hesap1 = new BankaHesabi("TR123456789", 1000);

        // try-catch blokları ile hataları yakalayalım
        try {
            // Para çekme işlemi: Başarılı
            hesap1.paraCek(500);

            // Para çekme işlemi: Yetersiz bakiye durumu (Özel istisna fırlatılacak)
            hesap1.paraCek(600); // Bu satırda istisna fırlatılacak
        } catch (YetersizBakiyeException e) {
            // Kendi oluşturduğumuz özel istisna yakalanıyor
            System.out.println("Hata: " + e.getMessage());
        }

        // Yatırma işlemi: Pozitif miktar yatırılacak
        hesap1.paraYatir(200);

        // Negatif para yatırma işlemi: throw ile IllegalArgumentException fırlatalım
        try {
            hesap1.paraYatir(-50); // Bu satırda istisna fırlatılacak
        } catch (IllegalArgumentException e) {
            // Hazır bir exception sınıfı yakalanıyor
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
