/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ooppolimorfizmus;

/**
 *
 * @author Hp
 */
public class OOPPolimorfizmus {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
        Dog buci = new Dog("Buci", 20);
        Cat furmi = new Cat("Furmi", 6);
        furmi.makeDoromb();
        buci.makeSound();

        Pet teszt = new Dog("Bodri", 13);
        teszt.makeSound();
        Pet tesztMasik = new Cat("Foltos", 8);
        tesztMasik.makeSound();

        Pet[] pets = new Pet[3];
        pets[0] = teszt;
        pets[1] = tesztMasik;
        pets[2] = buci;

        pets[2].makeSound();

        //uj operátok instanceof--egy Objektum, egy adott tipusba tartozike vagy sem
        System.out.println("Dog?" + (pets[2] instanceof Dog));
        System.out.println("Cat?" + (pets[2] instanceof Cat));
        System.out.println("Pet?" + (pets[2] instanceof Pet));
        System.out.println("Dog?" + (buci instanceof Dog));
     }
     
}
