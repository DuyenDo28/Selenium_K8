package lesson12ExampleStrategyDesginPattern;

class Duck {

    protected QuackBehavior quackBehavior;

    void performQuackBehavior(){
        quackBehavior.quack();

    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
