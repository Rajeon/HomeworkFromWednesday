package assestments;

public class Hippo extends Animal {
    private String name;

    public Hippo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void speak(){

    }

    @Override
    public String greet() {
       return "A hippo goes munch";
    }

    @Override
    public String toString() {
        return "Hippo{" +
                "name='" + name + '\'' +
                '}';
    }
}

