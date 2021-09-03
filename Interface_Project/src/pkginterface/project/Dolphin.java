/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface.project;

/**
 *
 * @author aweaver
 */
public class Dolphin extends Mammal implements ISwim, IMakeSound {

    public Dolphin(String name, double bodyTemp) {
        super(name, bodyTemp);
    }

    @Override
    public void Swim() {
        System.out.println("Swam around a boat giggling.");
    }

    @Override
    public void MakeSound() {
        System.out.println("Hehehehehehehehe");
    }
    
}
