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
public class Penguin extends Bird implements IWalk, ISwim, IMakeSound {

    public Penguin(String name, double wingSpan) {
        super(name, wingSpan);
    }

    @Override
    public void Walk() {
        System.out.println("Walked 2 feet");
    }

    @Override
    public void Swim() {
        System.out.println("Swam across the entire ocean.");
    }

    @Override
    public void MakeSound() {
        System.out.println("Squeak squeak");
    }
    
}
