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
public abstract class Mammal extends Animal{
    private double bodyTemp;

    public Mammal(String name, double bodyTemp) {
        super(name);
        this.bodyTemp = bodyTemp;
    }

    public double getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(double bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    @Override
    public String toString() {
        return "Mammal{" + "bodyTemp=" + bodyTemp + '}';
    }
    
    

}
