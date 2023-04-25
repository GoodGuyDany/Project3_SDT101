import soundmakers.SoundMaker;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Part 1.1
        SuperClass a = new SubClass(); // Creating a variable of the SuperClass type and assigning to it a new instance of the SubClass for
        a.theMethod(); // The method of SubClass is going to be called, as "a" is an object of SubClass
        System.out.println(a.getClass()); // Proof that "a" is an object of SubClass and not SuperClass

        System.out.println();
        System.out.println(); // Making some space
        System.out.println();

        // Part 1.2
        ArrayList<Animal> animalList = new ArrayList<>(); // Creating a new ArrayList of Animal class for
        // Adding objects to the list
        animalList.add(new Cat());
        animalList.add(new Dog());
        animalList.add(new Cow());
        animalList.add(new Pig());
        // Iterating and calling methods for each object in the ArrayList
        for (Animal animal : animalList) {
            animal.makeSound();
        }

        System.out.println();
        System.out.println(); // Making some space
        System.out.println();

        ArrayList<SoundMaker> soundmakersList = new ArrayList<>();
        soundmakersList.add(new Cat());
        soundmakersList.add(new Dog());
        soundmakersList.add(new Cow());
        soundmakersList.add(new Pig());
        soundmakersList.add(new Bee());
        soundmakersList.add(new Cricket());
        soundmakersList.add(new Frog());

        for (SoundMaker soundMaker : soundmakersList) {
            soundMaker.makeSound();
        }
    }
}