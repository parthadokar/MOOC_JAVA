public class Cube {
    private int edgeLength;
    private int volume;

    public Cube (int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume () {
        volume = this.edgeLength * this.edgeLength * this.edgeLength;
        return volume;
    }

    public String toString () {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume;
    }
}
