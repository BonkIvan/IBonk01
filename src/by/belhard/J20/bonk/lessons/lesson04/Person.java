package by.belhard.J20.bonk.lessons.lesson04;

public class Person {


    private final String DEFAULT_NANE = "Vasily";
     String name;
      int age;
      Country country;
      Sex sex;

    public Person(String name, int age, Country country, Sex sex) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.sex = sex;
    }
    public Person(String name, Country country){
        this(name, 18, country, sex.MALE );
    }


    public Person(String name, Country co)

    public void walk(){
        System.out.println(name + "is walking");
    }

    public void eat(String dish){
            int a;
        System.out.printf("%s is eateng %s. Om-nom-nom!", name, dish);
    }

    public int growOld(){
        return ++age;
    }

    public String getName() {
        return name;
    }
    if (name.)
    public void setName(String name) {
        this.name = name;
    }
}
