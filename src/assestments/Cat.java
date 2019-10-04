package assestments;

public class Cat extends Feline implements Pet {
    private String name;

    public Cat(String name) {
        super("Fluffy");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("meow");
    }

    @Override
    public String greet() {
        return "A cat goes meow";

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String play() {
        return "play with yarnball";
    }
}
