/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopabstractclass;

/**
 *
 * @author Hp
 */
public abstract class KimenetiEszköz {
     
     private String gyártó;
     private String tipus;
     private int ár;

     public KimenetiEszköz(String gyártó, String tipus, int ár) {
          this.gyártó = gyártó;
          this.tipus = tipus;
          this.ár = ár;
     }

     @Override
     public String toString() {
          return "KimenetiEszk\u00f6z{" + "gy\u00e1rt\u00f3=" + gyártó + ", tipus=" + tipus + ", \u00e1r=" + ár + '}';
     }

     public String getGyártó() {
          return gyártó;
     }

     public void setGyártó(String gyártó) {
          this.gyártó = gyártó;
     }

     public String getTipus() {
          return tipus;
     }

     public void setTipus(String tipus) {
          this.tipus = tipus;
     }

     public int getÁr() {
          return ár;
     }

     public void setÁr(int ár) {
          this.ár = ár;
     }
     
     
    
          
     public abstract void zugas(); // abstract metódus  => NINCS TÖRZS
     
     
}
