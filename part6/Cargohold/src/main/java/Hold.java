import java.util.ArrayList;

public class Hold {
    private Integer maximumWeight;
    ArrayList<Suitcase> suitcases;

    public Hold(Integer maxWeight) {
        this.maximumWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase (Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int sumOfWeights = 0;
        for (Suitcase suitcase : suitcases) {
            sumOfWeights += suitcase.totalWeight();
        }

        return sumOfWeights;
    }

    public void printItems () {
        for (Suitcase s : suitcases) {
            System.out.println(s.listItems());
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
