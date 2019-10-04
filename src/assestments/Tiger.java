package assestments;

public class Tiger extends Feline {
    private String name;

    public Tiger(String name) {
        super("max");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("Grrr");
    }

    @Override
    public String greet() {
        return "A tiger goes grrrrr";

    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                '}';
    }
}
