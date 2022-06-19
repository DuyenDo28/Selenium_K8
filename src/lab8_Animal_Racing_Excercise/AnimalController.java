package lab8_Animal_Racing_Excercise;

import java.security.SecureRandom;
import java.util.*;

class AnimalController {
    public static void main(String[] args) {

        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();

        System.out.printf("Speed of horse is %d, tiger is %d, dog is %d \n", horse.speed(),tiger.speed(),dog.speed());
        HashMap<String,Integer> mapOfAnimalSpeed =new HashMap<String,Integer>();
        mapOfAnimalSpeed.put("Horse",horse.speed());
        mapOfAnimalSpeed.put("Tiger",tiger.speed());
        mapOfAnimalSpeed.put("Dog",dog.speed());
        // print out the all the animals run with fastest speed
        AnimalRunWithMaxSpeed(mapOfAnimalSpeed);

    }
    public static void AnimalRunWithMaxSpeed(HashMap<String, Integer> animalSpeedList) {

        int maxSpd = (Collections.max(animalSpeedList.values()));

        for (Map.Entry<String, Integer> entry : animalSpeedList.entrySet()) {  // Iterate through HashMap
            if (entry.getValue() == maxSpd) {
              // Print the key with max value, Animal Name with fastest speed
                System.out.printf("The animal name %s run with fastest speed is %d \n", entry.getKey(),maxSpd);
            }
        }
    }
}
