package lab10_Abstract_RacingAnimal;

import java.util.HashMap;

public class AnimalRacingTest {

    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        AnimalRacingController animalRacingController= new AnimalRacingController();

        System.out.printf("Speed of horse is %d, tiger is %d, dog is %d \n", horse.speed(),tiger.speed(),dog.speed());
        HashMap<String,Integer> mapOfAnimalSpeed =new HashMap<String,Integer>();
        mapOfAnimalSpeed.put("Horse",horse.speed());
        mapOfAnimalSpeed.put("Tiger",tiger.speed());
        mapOfAnimalSpeed.put("Dog",dog.speed());
        // print out the all the animals run with fasest speed
        animalRacingController.AnimalRunWithMaxSpeed(mapOfAnimalSpeed);
    }
}
