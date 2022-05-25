package gyakorlaasss;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Gyakorlaasss {
    public static void main(String[] args) {
        final String filenev = "osztalyra";
        
        fileKiiras(szamGeneralas());
        //Alkalmazott Timi = new Alkalmazott("Timi", 19, 168.5, true);
        Alkalmazott Timi = new Alkalmazott("Timi,19,168.5,no");
        //System.out.println(Timi.toString());
        //System.out.println(Timi.nem());
        String kisbetus = "kisbetubolnagy";
        kisbetus = kisbetus.toUpperCase();
        System.out.println(kisbetus);
        kisbetus = kisbetus.toLowerCase();
        System.out.println(kisbetus);
        System.out.println(kisbetus.length()+" betubol all.");
        
        if(kisbetus.indexOf("a") > 0)
            System.out.println("Talalhato benne 'a' betu.");
        else
            System.out.println("Nem talalhato benne 'a' betu.");
        
        //ritkitas
        String ritkitas = "Indul a görög aludni";
        for (int i = 0; i < ritkitas.length(); i++)
            System.out.print(ritkitas.charAt(i)+" ");
        System.out.println("");
        
        //OSZTALYOK....
        try{
            ArrayList<Alkalmazott> alkalmazottak = new ArrayList<>();
            RandomAccessFile osztalyos = new RandomAccessFile(filenev+".txt", "r");
            osztalyos.seek(0);
            
            for(String sor = osztalyos.readLine(); sor != null; sor = osztalyos.readLine() ){
                alkalmazottak.add( new Alkalmazott(sor) );
            }
            
            osztalyos.close();
        }catch(IOException e){System.out.println(e);}
        
        Timi.setMagassag(166);
        System.out.println(Timi.nev); 
        System.out.println(Timi.getMagassag());
        
        System.out.println("\nRENDEZES\n");
        
        int[] tomb = {10,0,21,30,14,4,8,3,6,1,2,6,3,2,12,11};
        
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i]+", ");
        }
        System.out.println("");
        
        int csere;
        for( int i = 0; i < tomb.length-1; i++ ){
            for( int j = i+1; j < tomb.length; j++ ){
                if( tomb[i] > tomb[j] ){
                    csere = tomb[i];
                    tomb[i] = tomb[j];
                    tomb[j] = csere;
                }
            }
        }
        
        System.out.println("RENDEZETT TÖMB: ");
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i]+", ");
        }
        System.out.println("");
    }
    
    public static void beolvas(){
        try{
            RandomAccessFile bemenet = new RandomAccessFile("kiir.txt", "r");
            
            int db = 0;
            for(String sor = bemenet.readLine(); sor != null; sor = bemenet.readLine() ){
                db++;
            }
            
            int[] vector = new int[db];
            
            db = 0;
            bemenet.seek(0);
            
            for(String sor = bemenet.readLine(); sor != null; sor = bemenet.readLine() ){
                vector[db] = Integer.parseInt(sor);
                db++;
            }
            
            for (int i = 0; i < vector.length; i++) {
                System.out.print(vector[i]+", ");
            }
            System.out.println("");
            
            
            bemenet.close();
        }catch(IOException e){System.out.println(e);}
    }
    
    public static ArrayList<Integer> szamGeneralas(){
        ArrayList<Integer> szamok = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            szamok.add(rand.nextInt(100) + 1);
        }
        return szamok;
    }

    public static void fileKiiras(ArrayList<Integer> szamok){
        try {
            RandomAccessFile raf = new RandomAccessFile("kiir.txt", "rw");
            raf.setLength(0);
            raf.seek(0);
            for (int i = 0; i < szamok.size(); i++) {
                raf.writeBytes(szamok.get(i)+"\n");
            }
            
            raf.close();
        }catch (IOException e){System.out.println(e);}
    }
}