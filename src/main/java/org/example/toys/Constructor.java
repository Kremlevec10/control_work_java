package org.example.toys;

public class Constructor implements Toy {
    private String name;
    private int weight;
    private int id;

    public Constructor(String name, int weight) {
        this.id = 1;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String info() {
        return "Игрушка - " + name + " ее вес - " + weight + " id = " + id;
    }
}
