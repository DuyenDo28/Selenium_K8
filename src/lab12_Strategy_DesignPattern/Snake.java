package lab12_Strategy_DesignPattern;

import java.security.SecureRandom;

public class Snake extends Animal {

    int snakeSpeed = new SecureRandom().nextInt(40);

    public Snake() {
        flyBehavior = new NotFlyByWings();
    }

    @Override
    protected int getSpeed() {
        return snakeSpeed;
    }

    @Override
    public String getAnimalName() {
        String snakeName = "Snake";
        return snakeName;
    }

    @Override
    public boolean isFlyAble() {
        return false;
    }
}
