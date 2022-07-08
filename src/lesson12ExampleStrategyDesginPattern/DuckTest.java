package lesson12ExampleStrategyDesginPattern;

public class DuckTest {

     static void soundOfDuck(Duck duck){
        duck.performQuackBehavior();
    }

    public static void main(String[] args) {
        soundOfDuck(new MallardDuck());
        soundOfDuck(new BabyDuck());
        soundOfDuck(new Decoy());

        // Test can change sound of DecoyDuck to be the same with BabyDuck
        Duck decoy = new Decoy();
        decoy.setQuackBehavior(new Squeak());
        soundOfDuck(decoy);
    }
}
