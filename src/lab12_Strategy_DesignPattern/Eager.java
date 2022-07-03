package lab12_Strategy_DesignPattern;

import java.security.SecureRandom;

public class Eager extends Animal{

    @Override
    public String getAnimalName() {
        String eagerName= "Eager";
        return eagerName;
    }

    public Eager(){
        flyBehavior = new FlyByWings();
    }

}
