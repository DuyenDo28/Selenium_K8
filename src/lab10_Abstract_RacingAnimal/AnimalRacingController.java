package lab10_Abstract_RacingAnimal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AnimalRacingController {


    // Find out all animals racing with fastest speed
    public static void animalRunWithMaxSpeed(HashMap<String, Integer> animalSpeedList) {

        int maxSpd = (Collections.max(animalSpeedList.values()));

        for (Map.Entry<String, Integer> entry : animalSpeedList.entrySet()) {  // Iterate through HashMap
            if (entry.getValue() == maxSpd) {
                // Print the key with max value, Animal Name with fastest speed
                System.out.printf("The animal name %s run with fastest speed is %d \n", entry.getKey(),maxSpd);
            }
        }
    }
}
