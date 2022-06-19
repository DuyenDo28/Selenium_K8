package lab9_RacingAnimalWithBuilderDesignPattern;

import java.security.SecureRandom;

public class AnimalWithBuilder {

    private boolean isWithWings=true;
    private String animalName= "animal";
    private int speed;

    public String getAnimalName() {
        return animalName;
    }

    public boolean isWithWings() {
        return isWithWings;
    }
    int randomspd = new SecureRandom().nextInt(60);

    public int getSpeed() {
        return randomspd;
    }

    @Override
    public String toString() {
        return "AnimalWithBuilder{" +
                "animalName=" + animalName +
                ", isWithWings= " +  isWithWings+ '\'' +
                ", speed=" + speed +
                '}';
    }

    protected AnimalWithBuilder(Builder builder) {
        // READ-ONLY
        this.speed=builder.speed;
        this.isWithWings=builder.isWithWings;
        this.animalName=builder.animalName;


    }

    // inner class
    public static class Builder {

        private boolean isWithWings;
        private String animalName;
        private int speed;

        // Write only

        public void setWithWings(boolean withWings) {
            isWithWings = withWings;
        }

        public void setSpeed() {
            this.speed = speed;
        }
        public void setAnimalName(String animalName) {
            this.animalName = animalName;

        }

        public AnimalWithBuilder build(){
            return new AnimalWithBuilder(this);
        }
    }


}
