/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopabstractclass;

/**
 *
 * @author Hp
 */
public class Monitor extends KimenetiEszköz implements ErtekCsokkenes{
     private String képarány;
     private double átmérő; // coll

     public Monitor(String képarány, double átmérő, String gyártó, String tipus, int ár) {
          super(gyártó, tipus, ár);
          this.képarány = képarány;
          this.átmérő = átmérő;
     }

     @Override
     public String toString() {
          return "Monitor{" + "k\u00e9par\u00e1ny=" + képarány + ", \u00e1tm\u00e9r\u0151=" + átmérő + '}';
     }

     public String getKéparány() {
          return képarány;
     }

     public void setKéparány(String képarány) {
          this.képarány = képarány;
     }

     public double getÁtmérő() {
          return átmérő;
     }

     public void setÁtmérő(double átmérő) {
          this.átmérő = átmérő;
     }
     
     @Override
     public void zugas() {
          System.out.println("halkan duruzsol");
     }

     //implement method
     
     @Override
     public double arany(int ertek) {
           return 100.0* this.getÁr() / ertek;  // %-os arány
     }
     
     
}


