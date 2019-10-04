package assestments;

public class RoboDog extends Robot implements Pet {
    private String name;

    public RoboDog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("Mech woof");

    }

    public String greet() {
      return "mech woof";
    }

    @Override
    public String toString() {
        return "RoboDog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String play() {
        return "play with the mech ball";
    }
}
