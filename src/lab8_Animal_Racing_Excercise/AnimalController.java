package lab8_Animal_Racing_Excercise;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public static void main(String[] args) {


        int randomHorseSpeed = new SecureRandom().nextInt(75);
        Horse horse = new Horse();
        int horseSpeed = horse.speed(randomHorseSpeed);
        System.out.printf("Horse speeds is %d \n", horseSpeed);
        int randomTigerSpeed = new SecureRandom().nextInt(100);
        Tiger tiger = new Tiger();
        int tigerSpeed = tiger.speed(randomTigerSpeed);
        System.out.printf("Tiger speeds is %d \n ", tigerSpeed);

        int randomDogSpeed = new SecureRandom().nextInt(60);
        Dog dog = new Dog();
        int dogSpeed = dog.speed(randomDogSpeed);
        System.out.printf("Dog speeds is %d \n ", dogSpeed);

        if (horseSpeed >= tigerSpeed) {
            if (horseSpeed >= dogSpeed) {
                System.out.printf("Horse is winner with speeds %d w \n ", horseSpeed);
            }
        }
        if (tigerSpeed >= horseSpeed) {
            if (tigerSpeed >= dogSpeed) {
                System.out.printf("Tiger is winner with speeds %d \n ", tigerSpeed);
            }
        }
        if (dogSpeed >= horseSpeed) {
            if (dogSpeed >= tigerSpeed) {
                System.out.printf("Dog is winner with speeds %d \n", dogSpeed);
            }
        }
    }
}
