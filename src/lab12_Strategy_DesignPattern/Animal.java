package lab12_Strategy_DesignPattern;

import java.security.SecureRandom;

public abstract class Animal {
    protected FlyBehavior flyBehavior;

    public String getAnimalName() {
        return animalName;
    }

    protected String animalName;
    int animalSpeed = new SecureRandom().nextInt(50);
    int speed;

    protected int getSpeed() {
        return animalSpeed;
    }

    public boolean isFlyAble() {
        return flyBehavior.isFlyAble();
    }

}
