package lab10_Abstract_RacingAnimal;

import java.security.SecureRandom;

public class Horse extends Animal{

    int horseSpeed = new SecureRandom().nextInt(50);
    @Override
    int speed() {
        return horseSpeed;
    }
}
