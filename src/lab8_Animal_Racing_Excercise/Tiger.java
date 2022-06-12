package lab8_Animal_Racing_Excercise;

import java.security.SecureRandom;

public class Tiger extends Animal{
    int randomTigerSpeed = new SecureRandom().nextInt(100);
    @Override
    public int speed() {
        return randomTigerSpeed;
    }

}
