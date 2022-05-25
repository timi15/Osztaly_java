/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopabstractclass;

/**
 *
 * @author Hp
 */
public class Nyomtato extends KimenetiEszköz{
     
     private String formátum;
     private boolean szines;

     public Nyomtato(String formátum, boolean szines, String gyártó, String tipus, int ár) {
          super(gyártó, tipus, ár);
          this.formátum = formátum;
          this.szines = szines;
     }

     @Override
     public String toString() {
          return "Nyomtato{" + "form\u00e1tum=" + formátum + ", szines=" + szines + '}';
     }

     public String getFormátum() {
          return formátum;
     }

     public void setFormátum(String formátum) {
          this.formátum = formátum;
     }

     public boolean isSzines() {
          return szines;
     }

     public void setSzines(boolean szines) {
          this.szines = szines;
     }
     
     @Override
     public void zugas (){
          System.out.println("hangosan kattog");
     }
     
     
     
}
