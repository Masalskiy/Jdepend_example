import animals.Dog;
import animals.Human;
import animals.Sparrow;
import figures.*;

class Main {

    public static void main(String[] args) {
        Human human = new Human("John", 20);
        Sparrow sparrow = new Sparrow();
        Dog dog = new Dog("Тузик", 2);
        sparrow.canFly();
        human.addPet(dog);

        Figure figure = new Rectangle(0, 0, 3, 2);
        human.canCount(figure);

        //человеку нужно посчитать площадь и периметр
        //связывем два пакета
    }

}
