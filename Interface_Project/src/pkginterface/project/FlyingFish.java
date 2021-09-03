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
public class FlyingFish extends Fish implements IFly, ISwim, IMakeSound{

    public FlyingFish(String name, boolean isSaltWater) {
        super(name, isSaltWater);
    }

    @Override
    public void Fly() {
        System.out.println("Flew out of water and hit you in the face");
    }

    @Override
    public void Swim() {
        System.out.println("swam around to get ready for a leap of faith out of the water");
    }

    @Override
    public void MakeSound() {
        System.out.println("*Flying Fish Noises*");
    }
    
}
