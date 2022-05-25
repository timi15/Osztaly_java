package osztalyGyak0401;

public class Kutya extends Eloleny { //extends +  osztaly = öröklődés
    private int labaiszama;


    public int getLabaiszama() {
        return labaiszama;
    }

    public Kutya(String nev, int labaiszama) { //konstruktor
        super(nev);
        this.labaiszama = labaiszama;
    }

    String ugat(){
        return ("wou wou");
    }






}

