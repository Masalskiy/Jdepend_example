package animals;

public class Dog extends MammalAbstract implements CanEatInterface, CanRunInterface {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println("Dog" + super.getName() + "running");
    }

    @Override
    public void eat() {
        System.out.println("Dog" + super.getName() + "eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog" + super.getName() + "sleeping");
    }
}
