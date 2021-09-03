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
public class Bass extends Fish implements ISwim, IMakeSound {

    public Bass(String name, boolean isSaltWater) {
        super(name, isSaltWater);
    }

    @Override
    public void Swim() {
        System.out.println("Swam away from shark");
    }

    @Override
    public void MakeSound() {
        System.out.println("*Bass noises*");
    }
    
}
