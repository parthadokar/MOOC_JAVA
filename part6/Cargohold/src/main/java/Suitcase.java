import java.util.ArrayList;

public class Suitcase {
    private Integer maximumWeight;
    ArrayList<Item> items = new ArrayList<>();

    public Suitcase (Integer maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem (Item item) {
        int currentWeight = 0;
        for (Item i : items) {
            currentWeight += i.getWeight();
        }

        if (currentWeight + item.getWeight() <= this.maximumWeight) {
            this.items.add(item);
        }
    }

    public String listItems(){

        String listItems =  "";

        for(Item item : items){
            listItems += item.toString() + "\n";
        }

        return listItems;
    }

    public Integer totalWeight() {
        int sumOfWeights = 0;
        for (Item i : items) {
            sumOfWeights += i.getWeight();
        }
        return sumOfWeights;
    }

    public Item heaviestItem () {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviestWeight = items.get(0);
        for (Item i : items) {
           if (i.getWeight() > heaviestWeight.getWeight()) {
               heaviestWeight = i;
           }
        }
        return heaviestWeight;
    }

    @Override
    public String toString() {
        int totalWeight = 0;
        for (Item i : items) {
            totalWeight += i.getWeight();
        }

        if (items.isEmpty()) {
            return "no items (0 kg)";
        }

        String itemString = items.size() == 1 ? "item" : "items";
        return items.size() + " " + itemString + " (" + totalWeight + " kg)";
    }
}
