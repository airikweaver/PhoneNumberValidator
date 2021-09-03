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
public class Ostrich extends Bird implements IMakeSound, IWalk{
    
    public Ostrich(String name, double wingSpan) {
        super(name, wingSpan);
    }
    
    @Override
    public void MakeSound() {
        System.out.println("SQUAWKKKK!!");
    }

    @Override
    public void Walk() {
        System.out.println("Walked 5 steps.");
    }
    
}
