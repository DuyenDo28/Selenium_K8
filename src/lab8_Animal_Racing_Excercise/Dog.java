package lab8_Animal_Racing_Excercise;

import java.security.SecureRandom;

class Dog extends Animal{
    int randomDogSpeed = new SecureRandom().nextInt(60);
    @Override
    public int speed() {
        return randomDogSpeed;
    }

}
