package lesson12ExampleStrategyDesginPattern;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack Quack !!!");
    }
}
