/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface.project;

import java.util.ArrayList;

/**
 *
 * @author aweaver
 */
public class InterfaceProject {

    public static void main(String[] args) {
       
        Ostrich ostrich = new Ostrich("James", 10.2);
        Penguin penguin = new Penguin("Wilbur", 5.3);
        Eagle eagle = new Eagle("Spike", 30.6);
        Dolphin dolphin = new Dolphin("Ray", 96.8);
        Lion lion = new Lion("Simba", 98.9);
        Bat bat = new Bat("Zeek", 97.7);
        Shark shark = new Shark("Tyrone", true);
        Bass bass = new Bass("Anderson", false);
        FlyingFish flyingfish = new FlyingFish("RickyBobby", true);
        
        ArrayList<Animal> animals = new ArrayList<>();
            animals.add(eagle);
            animals.add(dolphin);
            animals.add(bat);
            animals.add(lion);
            animals.add(shark);
            animals.add(bass);
            animals.add(flyingfish);
            animals.add(ostrich);
            animals.add(penguin);
        for (Animal animal  : animals )
        {
            System.out.println(animal.getName());
        }
        
        ArrayList<Bird> birds = new ArrayList<>();
            birds.add(eagle);
            birds.add(ostrich);
            birds.add(penguin);
        for (Bird bird : birds )
        {
            System.out.println(bird.getWingSpan());
            
        }
        
        ArrayList<Mammal> mammals = new ArrayList<>();
            mammals.add(dolphin);
            mammals.add(bat);
            mammals.add(lion);
        for (Mammal mammal  : mammals)
        {
            System.out.println(mammal.getBodyTemp());
            
        }
        
        ArrayList<Fish> fish = new ArrayList<>();
            fish.add(shark);
            fish.add(bass);
            fish.add(flyingfish);
        for (Fish fishs  : fish)
        {
            System.out.println(fishs.isIsSaltWater());
            
        }
        
        ArrayList<IFly> flyers = new ArrayList<>();
            flyers.add(eagle);
            flyers.add(bat);
            flyers.add(flyingfish);
        for (IFly flyingThings : flyers)
        {
            flyingThings.Fly();
        }
        
        ArrayList<IWalk> walkers  = new ArrayList<>();
            walkers.add(lion);
            walkers.add(ostrich);
            walkers.add(penguin);
        for (IWalk walkingThings  : walkers )
        {
            walkingThings.Walk();
        }
        
        ArrayList<ISwim> swimmers = new ArrayList<>();
            swimmers.add(shark);
            swimmers.add(bass);
            swimmers.add(flyingfish);
            swimmers.add(penguin);
        for (ISwim swimmer  : swimmers)
        {
            swimmer.Swim();
        }
        
        ArrayList<IMakeSound> makesound = new ArrayList<>();
            makesound.add(eagle);
            makesound.add(dolphin);
            makesound.add(bat);
            makesound.add(lion);
            makesound.add(shark);
            makesound.add(bass);
            makesound.add(flyingfish);
            makesound.add(ostrich);
            makesound.add(penguin);
        for (IMakeSound soundMakers : makesound )
        {
            soundMakers.MakeSound();
        }
        
        
        
        
        
        
        
    }
    
}
