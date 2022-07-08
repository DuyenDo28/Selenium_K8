package lesson12ExampleStrategyDesginPattern;

class MallardDuck extends  Duck{

    public MallardDuck() {
        quackBehavior= new Quack();
    }
}
