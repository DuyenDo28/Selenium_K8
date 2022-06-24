package lab10_Abstract_RacingAnimal;

import java.security.SecureRandom;

public class Dog extends Animal{
    int dogSpeed = new SecureRandom().nextInt(50);

    @Override
    int speed() {
        return dogSpeed;
    }
}
