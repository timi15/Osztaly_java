
//OSZTÁLY LÉTREHOZÁSA

//1. java class
//2. mező
//3. konstruktor
//4. getter
//5. setter
//6. toString

public class Auto {
    private String marka;  //mező
    private String szin;
    private String tipus;
    private int kcm;

    public Auto(String marka, String szin, String tipus, int kcm) {  //Alt + Insert  Constructor
        this.marka = marka;
        this.szin = szin;
        this.tipus = tipus;
        this.kcm = kcm;
    }

    @Override  //Alt + Insert   toString  //beépített metódus
    public String toString() {
        return "Auto " +"marka='" + marka + '\'' + ", szin='" + szin + '\'' +", tipus='" + tipus + '\'' + ", kcm=" + kcm +'}';
    }

    public String getMarka() {  //Alt + Insert  Getter   -> az objektum értékét adja vissza
        return marka;
    }

    public String getSzin() {
        return szin;
    }

    public String getTipus() {
        return tipus;
    }

    public int getKcm() {
        return kcm;
    }

    public void setMarka(String marka) {  //Alt + Insert  Setter   -> az objektum egyik értékének megváltoztatása
        this.marka = marka;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setKcm(int kcm) {
        this.kcm = kcm;
    }
}
