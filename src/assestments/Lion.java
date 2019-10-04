package assestments;

public class Lion extends Feline {
    private String name;

    public Lion(String name) {
        super("dex");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("Rawr");
    }



    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String greet() {
        return "A lion goes rawr";

    }
}
