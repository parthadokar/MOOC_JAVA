public class Gift {
    private String name;
    private Integer weight;

    public Gift () {}
    public Gift (String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName () {
        return this.name;
    }

    public int getWeight () {
        return this.weight;
    }

    public String toString () {
        return this.name + " (" + this.weight + " kg)";
    }
}
