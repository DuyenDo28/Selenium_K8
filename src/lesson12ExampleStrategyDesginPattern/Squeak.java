package lesson12ExampleStrategyDesginPattern;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak Squeak !!!");
    }
}
