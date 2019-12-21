package work4;

public class Elephant extends Animal{
    public Elephant() {
    }
    public Elephant(String name, int weight, int force) {
        super(name, weight, force);
    }
    @Override
    public void eat() {
        System.out.println("大象开心的吃水果");
    }
}
