package by.belhard.J20.bonk.lessons.lesson06.collectionsExample;
public class Value {

    private String name;

    public Value(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}