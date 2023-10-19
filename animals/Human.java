package animals;

import java.util.ArrayList;
import java.util.List;
import figures.*;

public class Human extends MammalAbstract implements CanRunInterface, CanCountInterface, CanEatInterface  {

    // добавляю связь между классами
    private final List<MammalAbstract> pets = new ArrayList<>();
    
    public Human(String name, int age) {
        super(name, age);
    }

    public void addPet(MammalAbstract pet) {
        pets.add(pet);
    }

    @Override
    public void eat() {
        System.out.println("Human" + super.getName() + "eating");
    }

    @Override
    public void canCount() {
        System.out.println("Human" + super.getName() + "can count");
    }

    public void canCount(Figure figure) {
        System.out.println("Площадь равна: " + figure.getArea());
        System.out.println("Периметр равен: " + figure.getPerimeter());
    }


    @Override
    public void run() {
        System.out.println("Human" + super.getName() + "running");
    }

    @Override
    public void sleep() {
        System.out.println("Human" + super.getName() + "sleeping");
    }

}
