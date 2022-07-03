package lab12_Strategy_DesignPattern;

import java.security.SecureRandom;

public class Tiger extends Animal {

    int tigerSpeed = new SecureRandom().nextInt(100);

    public Tiger() {
        flyBehavior = new NotFlyByWings();
    }

    @Override
    protected int getSpeed() {
        return tigerSpeed;
    }

    @Override
    public String getAnimalName() {
        String tigerName = "Tiger";
        return tigerName;
    }

    @Override
    public boolean isFlyAble() {
        return false;
    }
}
