package lab12_Strategy_DesignPattern;

public class NotFlyByWings implements FlyBehavior {
    @Override
    public boolean isFlyAble() {
        return false;
    }
}
