package animals;

public class Sparrow implements CanFlyInterface, CanEatInterface {

    @Override
    public void eat() {
        System.out.println("Sparrow eating");
    }

    @Override
    public boolean canFly() {
        System.out.println("Sparrow fly");
        return true;
    }
}
