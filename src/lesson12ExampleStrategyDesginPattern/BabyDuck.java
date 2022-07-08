package lesson12ExampleStrategyDesginPattern;

public class BabyDuck extends Duck{

    public BabyDuck() {

        quackBehavior=new Squeak();
    }
}
