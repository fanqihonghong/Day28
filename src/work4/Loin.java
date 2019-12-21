package work4;

public class Loin extends Animal {
    public Loin() {
    }
    public Loin(String name, int weight, int force) {
        super(name, weight, force);
    }
    @Override
    public void eat() {
        System.out.println("狮子开心的吃肉");
    }
}
