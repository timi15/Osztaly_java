/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooppolimorfizmus;

/**
 *
 * @author Hp
 */
public class Dog extends Pet{
     
     private boolean chipped = true;

    public Dog(String name, int month) {
        super(name, month);
    }

    @Override
    public void makeSound() {
        System.out.println("vau-vau");

    }

    public boolean isChipped() {
        return chipped;
    }

    public void setChipped(boolean chipped) {
        this.chipped = chipped;
    }
     
}
