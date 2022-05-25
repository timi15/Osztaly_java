/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooppolimorfizmus;

/**
 *
 * @author Hp
 */
public class Cat extends Pet{
     
      @Override
     public void makeSound() {
          System.out.println("miau-miau");
     }

     public Cat(String name, int month) {
          super(name, month);
     }

     public void makeDoromb() {
          System.out.println("doromb-doromb");
     }
     
}
