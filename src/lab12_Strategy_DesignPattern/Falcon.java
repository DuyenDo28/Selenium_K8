package lab12_Strategy_DesignPattern;

public class Falcon extends Animal {

    public Falcon() {
        flyBehavior = new FlyByWings();
    }

    @Override
    public String getAnimalName() {
        String falconName = "Eager";
        return falconName;
    }

}
