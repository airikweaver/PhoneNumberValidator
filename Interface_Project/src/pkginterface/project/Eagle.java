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
public class Eagle extends Bird implements IFly, IMakeSound{

    public Eagle(String name, double wingSpan) {
        super(name, wingSpan);
    }

    @Override
    public void Fly() {
        System.out.println("Flew across the world");
    }

    @Override
    public void MakeSound() {
        System.out.println("SQUAWKKKKK");
    }
    
}
