package osztalyGyak0401;

import java.util.Random;

public class CicaMain {
    public static void main(String[] args) {
        Cica cica= new Cica("Cirmi", "fekete");
        System.out.println(cica.getNev()+ " "+ cica.getSzin());

        System.out.println(cica.nyavog());

        Random random= new Random();

        int velszam= random.nextInt(2)+0;
        System.out.println(velszam);

        if(velszam==1){
            System.out.println(cica.nyavog());
        }
        else {
            System.out.println("alszik");
        }

    }
}
