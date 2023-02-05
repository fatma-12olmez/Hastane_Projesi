package Proje.hastaneprojesi;

public class Hasta extends VeriBankasi {
    private String hastaAdi;
    private String hastaSoyadi;
    private String hastaCinsiyet;
    private Integer hastaYasi;
    private String hastaID;


    public Hasta(String hastaAdi, String hastaSoyadi, String hastaCinsiyet, Integer hastaYasi, String hastaID) {
        this.hastaAdi = hastaAdi;
        this.hastaSoyadi = hastaSoyadi;
        this.hastaCinsiyet = hastaCinsiyet;
        this.hastaYasi = hastaYasi;
        this.hastaID = hastaID;

    }

    public String getHastaAdi() {
        return hastaAdi;
    }

    public void setHastaAdi(String hastaAdi) {
        this.hastaAdi = hastaAdi;
    }

    public String getHastaSoyadi() {
        return hastaSoyadi;
    }

    public void setHastaSoyadi(String hastaSoyadi) {
        this.hastaSoyadi = hastaSoyadi;
    }

    public String getHastaCinsiyet() {
        return hastaCinsiyet;
    }

    public void setHastaCinsiyet(String hastaCinsiyet) {
        this.hastaCinsiyet = hastaCinsiyet;
    }

    public Integer getHastaYasi() {
        return hastaYasi;
    }

    public void setHastaYasi(Integer hastaYasi) {
        this.hastaYasi = hastaYasi;
    }

    public String getHastaID() {
        return hastaID;
    }

    public void setHastaID(String hastaID) {
        this.hastaID = hastaID;
    }
    @Override
    public String toString() {
        return "Hasta{" +
                "hastaAdi='" + hastaAdi + '\'' +
                ", hastaSoyadi='" + hastaSoyadi + '\'' +
                ", hastaCinsiyet='" + hastaCinsiyet + '\'' +
                ", hastaYasi=" + hastaYasi +
                ", hastaID='" + hastaID + '\'' +

        '}';
    }
}