package gyakorlaasss;

class Alkalmazott{
    String nev;
    private int eletkor;
    private double magassag;
    private boolean noe;

    public Alkalmazott(String sor) {
        String[] reszek = sor.split(",");
        
        boolean no = true;
        if(reszek[3].equals("ferfi"))
            no = false;
        
        this.nev = reszek[0];
        this.eletkor = Integer.parseInt(reszek[1]);
        this.magassag = Double.parseDouble(reszek[2]);
        this.noe = no;
    }
    
    public String nem(){
        if(noe)
            return "Nő";
        else
            return "Férfi";
    }

    @Override
    public String toString() {
        return "Alkalmazott: " + nev + ", " + eletkor + ", " + magassag + ", " + noe;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    public boolean isNoe() {
        return noe;
    }

    public void setNoe(boolean noe) {
        this.noe = noe;
    }
}
