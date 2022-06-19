package lab8_Animal_Racing_Excercise;

import java.security.SecureRandom;

class Horse extends Animal{
    int randomHorseSpeed = new SecureRandom().nextInt(75);
    @Override
    public int speed() {
         return randomHorseSpeed;
    }
}
