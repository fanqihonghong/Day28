package work4;

public abstract class Animal {
    private String name;
    private int weight;
    private int force;

    public Animal() {
    }
    public Animal(String name, int weight, int force) {
        this.name = name;
        this.weight = weight;
        this.force = force;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public abstract void eat();
}
