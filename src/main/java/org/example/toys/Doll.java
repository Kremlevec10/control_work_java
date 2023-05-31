package org.example.toys;

public class Doll implements Toy {
    private String name;
    private int weight;
    private int id;

    public Doll(String name, int weight) {
        this.id = 3;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String info() {
        return "Игрушка - " + name + " ее вес - " + weight + " id = " + id;
    }
}
