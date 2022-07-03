package lab12_Strategy_DesignPattern;


import java.util.*;

public class TestAnimalCRacing {

    public static void main(String[] args) {
        // Print out animal run with fastest speed
        new AnimalController().animalsRacingWithMaxSpeed(Arrays.asList(new Eager(), new Falcon(), new Snake(), new Tiger()));


    }


}
