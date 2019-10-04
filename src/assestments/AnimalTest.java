package assestments;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("rex");
        Cat cat = new Cat("Fluffy");
        Tiger tiger = new Tiger("Simba");
        RoboDog roboDog = new RoboDog("RobotDog");
        Lion lion = new Lion("Mufasa");
        Wolf wolf = new Wolf("BigBad");
        Hippo hippo = new Hippo("Gloria");

        Animal[] animals = {dog, cat, tiger, lion, wolf, hippo};

        System.out.println(animals);

        ArrayList<String> pets = new ArrayList();
        pets.add(dog.greet());
        pets.add(cat.greet());
        pets.add(tiger.greet());
        pets.add(wolf.greet());
        pets.add(hippo.greet());
        pets.add(lion.greet());



        for  (String animal: pets) {
            System.out.println(pets);
            break;
        }



    }
}















