package lesson12ExampleStrategyDesginPattern;

public class Decoy extends Duck{

    public Decoy() {
        quackBehavior=new Mute();
    }
}
