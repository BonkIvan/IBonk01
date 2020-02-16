package by.belhard.J20.bonk.homework.homeworck06;

public class Pet {
   private String name;
   private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void play (){
        System.out.println(name + ", say me something");
    };
}
