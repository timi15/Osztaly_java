package osztalyGyak0401;

import java.util.Random;

public class Cica extends  Eloleny {
     private  String  szin;

    public String getSzin() { //getter
        return szin;
    }

    public Cica(String nev, String szin) {  //konstruktor
        super(nev);
        this.szin = szin;
    }

    String nyavog(){
        return ("miuw miuw");
    }

}
