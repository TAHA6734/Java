public class bilgisayar {
    private monitor monitor;
    private kasa kasa;
    private anakart anakart;

    public bilgisayar(monitor monitor, anakart anakart, kasa kasa) {
        this.monitor = monitor;
        this.anakart = anakart;
        this.kasa = kasa;
    }

    public monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(monitor monitor) {
        this.monitor = monitor;
    }

    public anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(anakart anakart) {
        this.anakart = anakart;
    }

    public kasa getKasa() {
        return kasa;
    }

    public void setKasa(kasa kasa) {
        this.kasa = kasa;
    }
}
