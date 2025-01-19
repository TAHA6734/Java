public class account {

    private String HesapNo ;
    private String email ;
    private String telefonNO ;
    private String isim ;
    private double bakiye ;

    public void BilgiGoster(){

        System.out.println("Hesap No : " + " " +  this.HesapNo);
        System.out.println("Telefon No " + " " + this.telefonNO);
        System.out.println("Bakiye" + " " + this.bakiye);
        System.out.println("Isim" + " " + this.isim);
        System.out.println("email" + " " + this.email);
    }


    public void ParaYatir(double miktar){

        this.bakiye += miktar ;
        System.out.println("Yeni bakiye : " + this.bakiye);
    }

    public void ParaCekme(double miktar){

        if(miktar > 1500){
            System.out.println("Limit Hatasi(Gunde 1500TL'den fazla para cekilemez)");
        }
        if(bakiye - miktar  < 0 ){
            System.out.println("Yetersiz Bakiye (Guncel bakiye durumu)"+bakiye);

        }
            else {
                bakiye -= miktar ;
            System.out.println("Guncel bakiye : " + bakiye );
        }

    }

    public account(){

        /*this.isim = "Bilgi yok" ;
        this.email="Bilgi yok " ;
        this.bakiye = 0.0 ;
        this.telefonNO ="Bilgi Yok" ;
        this.HesapNo = "bilgi Yok " ;*/

        this("bilgi yok"," bilgi yok " ,"bilgi yok ",0.0 ,"bilgi yok "  ) ;
    }

    public account(String isim , String hesapNo , String telefonNO)
    {
        this(isim,hesapNo, telefonNO,0.0,"Bilgi yok");
    }

    public account(String isim , String hesapNo , String telefonNO , double bakiye , String email)
    {
        this.isim = isim ;
        this.bakiye = bakiye ;
        this.telefonNO = telefonNO;
        this.HesapNo = hesapNo;
        this.email=email;
    }



        public void setHesapNo(String HesapNo){

        this.HesapNo = HesapNo ;
        }

        public String getHesapNo()
        {
            return HesapNo ;
        }

        public void  setisim(String isim){

        this.isim = isim ;
        }

        public String getIsim(){

        return isim ;
        }


    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getTelefonNO() {

        return telefonNO;
    }

    public void setTelefonNO(String telefonNO) {

        this.telefonNO = telefonNO;
    }

    public double getBakiye() {

        return bakiye;
    }

    public void setBakiye(double bakiye) {

        this.bakiye = bakiye;
    }
}