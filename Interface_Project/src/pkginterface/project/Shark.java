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
public class Shark extends Fish implements ISwim, IMakeSound {

    public Shark(String name, boolean isSaltWater) {
        super(name, isSaltWater);
    }

    @Override
    public void Swim() {
        System.out.println("Swam around an innocent swimmer looking for food");
    }

    @Override
    public void MakeSound() {
        System.out.println("*shark noises*");
    }
    
}
