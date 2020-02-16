package by.belhard.J20.bonk.homework.homeworck06;

public class Cat extends Pet {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void play (){
        System.out.printf(super.getName() + " say meow  "  +"\n" + color + " " +super.getName() + " - Meow");
    }
}
