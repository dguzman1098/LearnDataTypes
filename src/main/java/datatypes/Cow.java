package datatypes;

public class Cow extends Animal {

    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void animalSound(){
        System.out.println("Moo");
    }
}
