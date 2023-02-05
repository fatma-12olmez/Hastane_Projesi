package Proje.hastaneprojesi;

public class Doktor extends VeriBankasi {


    private String isimSoyisim;
    private String brans;
    private String unvan;

    public Doktor(String isimSoyisim, String brans, String unvan) {
        this.isimSoyisim = isimSoyisim;
        this.brans = brans;
        this.unvan = unvan;
    }

    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }
    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "isimSoyisim='" + isimSoyisim + '\'' +
                ", brans='" + brans + '\'' +
                ", unvan='" + unvan + '\'' +
                '}';
    }
}