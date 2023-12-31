package animals;
public abstract class MammalAbstract {
    private String name;
    private int age;

    public abstract void sleep();

    public MammalAbstract(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    
}
