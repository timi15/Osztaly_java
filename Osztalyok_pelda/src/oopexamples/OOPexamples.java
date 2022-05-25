/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopexamples;

/**
 *
 * @author Hp
 */
public class OOPexamples {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
          
          //KisAllat az osztály
          
          KisAllat bodri= new KisAllat("Bodri", 20);  //objektum , példányosítás
         // KisAllat cirmi = new KisAllat("Cirmi", 9);
          KisAllat cirmi = new KisAllat("Cirmi:9");
          
          KisAllat vahur= bodri;  //nem jött létre új objektum, hanem létrejön egy új referencia
          
          System.out.println(bodri);
          System.out.println(vahur.toString());
          
          System.out.println(bodri.kor());
          System.out.println(cirmi.kor());
          
          //TILOS
          
          //System.out.println(bodri.kor);
          
          System.out.println(bodri.getKor());
          //bodri.setKor(-2);
          
          //System.out.println(bodri.getKor());
          
          
     }
     
}
