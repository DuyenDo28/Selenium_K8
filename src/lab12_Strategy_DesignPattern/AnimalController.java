package lab12_Strategy_DesignPattern;

import java.util.*;

public class AnimalController {

    public void animalsRacingWithMaxSpeed(List<Animal> animalList) {

        List<Animal> animalNotFly = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlyAble()) {
                animalNotFly.add(animal);
            }
        }

        Map<String, Integer> mapofAnimalAndSpeed = new HashMap<>();
        System.out.print("All animals not fly here\n");
        for (Animal animal : animalNotFly) {
            mapofAnimalAndSpeed.put(animal.getAnimalName(), animal.getSpeed());

            System.out.printf("Animal name %s run with Speed %d\n ",animal.getAnimalName(),animal.getSpeed());
        }

        System.out.printf("\n");


        int maxSpd = (Collections.max(mapofAnimalAndSpeed.values()));

        for (Map.Entry<String, Integer> entry : mapofAnimalAndSpeed.entrySet()) {  // Iterate through HashMap
            if (entry.getValue() == maxSpd) {
                // Print the key with max value, Animal Name with fastest speed
                System.out.printf("The animal name %s run with fastest speed is %d \n", entry.getKey(), maxSpd);
            }
        }
    }
}
