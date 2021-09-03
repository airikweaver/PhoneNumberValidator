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
public class Bat extends Mammal implements IFly, IMakeSound {

    public Bat(String name, double bodyTemp) {
        super(name, bodyTemp);
    }

    @Override
    public void Fly() {
        System.out.println("Flew into your car");
    }

    @Override
    public void MakeSound() {
        System.out.println("Squeak");
    }
    
}
