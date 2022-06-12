package lab8_Animal_Racing_Excercise;

import java.security.SecureRandom;
import java.util.*;

public class AnimalController {
    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();

        System.out.printf("Speed of horse is %d, tiger is %d, dog is %d \n", horse.speed(),tiger.speed(),dog.speed());
        HashMap<String,Integer> mapOfAnimalSpeed =new HashMap<String,Integer>();
        mapOfAnimalSpeed.put("Horse",horse.speed());
        mapOfAnimalSpeed.put("Tiger",tiger.speed());
        mapOfAnimalSpeed.put("Dog",dog.speed());
        maxSpeed(mapOfAnimalSpeed);

    }
    public static void maxSpeed(HashMap<String, Integer> animalSpeedList) {
        int maxSpd = (Collections.max(animalSpeedList.values()));
        for (Map.Entry<String, Integer> entry : animalSpeedList.entrySet()) {  // Iterate through HashMap
            if (entry.getValue() == maxSpd) {
              //  System.out.println(entry.getKey());     // Print the key with max value
                System.out.printf("The animal name %s run with fastest speed is %d", entry.getKey(),maxSpd);
            }
        }
    }
}
