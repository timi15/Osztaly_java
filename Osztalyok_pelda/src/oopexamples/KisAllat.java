/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopexamples;

/**
 *
 * @author Hp
 */
public class KisAllat {
     private String nev; //deklarálva van
     private int kor; // hónap
     
     
     //konstruktor

     public KisAllat(String nev, int kor) {
          this.nev = nev;
          this.kor = kor;
     }
     
     // más bemenő adat: "nev:kor";

     public KisAllat(String sor){
          String [] darabok= sor.split(":");
          this.nev= darabok[0];
          this.kor= Integer.parseInt(darabok[1]);
                  
     }

     @Override
     public String toString() {
          return "KisAllat{" + "nev=" + nev + ", kor=" + kor + '}';
     }
     
    public String kor(){
         return "A kora "+ (kor/12)+ "év "+(kor%12)+"hó";
    } 

     public String getNev() {
          return nev;
     }

     public void setNev(String nev) {
          this.nev = nev;
     }

     public int getKor() {
          return kor;
     }

     public void setKor(int kor) {
          if(kor<0){
               return;
          }
          this.kor = kor;
     }
    
    
     
         
     
}
