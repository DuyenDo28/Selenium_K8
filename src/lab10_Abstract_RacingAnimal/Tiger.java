package lab10_Abstract_RacingAnimal;

import java.security.SecureRandom;

public class Tiger extends Animal{

    int tigerSpeed = new SecureRandom().nextInt(50);

    @Override
    int speed() {
        return 0;
    }
}
