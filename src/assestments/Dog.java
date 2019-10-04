package assestments;

public class Dog extends Animal implements Pet {
    private String name;

    public Dog(String name) {
        super("Rex");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("woof");

    }

    @Override
    public String greet() {
        return "A dog goes woof";

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String play() {
        return "play with tennisball";
    }
}
