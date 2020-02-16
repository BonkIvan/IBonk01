package by.belhard.J20.bonk.homework.homeworck06;

public class Dog extends Pet {
    private String size;

    public Dog(String name, int age, String size) {
        super(name, age);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println(super.getName() + "  jump and bark");

    }
}
