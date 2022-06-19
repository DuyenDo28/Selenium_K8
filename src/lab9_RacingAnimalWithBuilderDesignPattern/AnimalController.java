package lab9_RacingAnimalWithBuilderDesignPattern;

import java.util.*;

public class AnimalController {

    public static void main(String[] args) {

        AnimalWithBuilder.Builder builder = new AnimalWithBuilder.Builder();
        builder.setAnimalName("Tiger");
        builder.setSpeed();
        builder.setWithWings(false);
        AnimalWithBuilder tiger = builder.build();
        builder.setAnimalName("Falcon");
        builder.setSpeed();
        builder.setWithWings(true);
        AnimalWithBuilder falcon = builder.build();

        builder.setAnimalName("Snake");
        builder.setSpeed();
        builder.setWithWings(false);
        AnimalWithBuilder snake = builder.build();

        builder.setAnimalName("Eager");
        builder.setSpeed();
        builder.setWithWings(true);
        AnimalWithBuilder eager = builder.build();

        List<AnimalWithBuilder> animalList = new ArrayList<>();
        animalList.add(tiger);
        animalList.add(eager);
        animalList.add(snake);
        animalList.add(falcon);
        // Print out all animals
        System.out.println("all animals include: "+ animalList);

       // List<AnimalWithBuilder> nonWingAnimalList = new ArrayList<>();
        HashMap<String,Integer> nonWingAnimalList =new HashMap<String,Integer>();
        for (AnimalWithBuilder animal : animalList) {
            if(animal.isWithWings()==false)
            {
                nonWingAnimalList.put(animal.getAnimalName(), animal.getSpeed());
            }

        }
        // Print out animals that have no wing
        System.out.println("The animals that have no wing include:  "+nonWingAnimalList);
        //Print out Animal run with fastest speed
        AnimalRunWithMaxSpeed(nonWingAnimalList);



    }


    public static void AnimalRunWithMaxSpeed(HashMap<String, Integer> animalSpeedList) {

        int maxSpd = (Collections.max(animalSpeedList.values()));

        for (Map.Entry<String, Integer> entry : animalSpeedList.entrySet()) {  // Iterate through HashMap
            if (entry.getValue() == maxSpd) {
                // Print the key with max value, Animal Name with fastest speed
                System.out.printf("The animal name %s run with fastest speed is %d \n", entry.getKey(), maxSpd);
            }
        }
    }
}
