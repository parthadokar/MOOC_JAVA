import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString () {
        String printString = "The collection " + this.name;

        if (this.elements.isEmpty()) {
            return printString + " is Empty";
        }

        String printValues = "";

        for (String element : elements) {
            if (elements.size() <= 1) {
                printValues = element;
            } else {
                printValues = printValues + element + "\n";
            }
        }

        String elementString = "";

        if (elements.size() >= 1) {
            elementString = "elements:\n";
        } else {
            elementString = "element:\n";
        }
        return printString + " has " + elements.size() + " " + elementString + printValues;
    }

    public String longest () {
        if (this.elements.isEmpty()) {
            return null;
        }

        String returnElement = this.elements.get(0);

        for (String element : this.elements) {
            if (returnElement.length() < element.length()) {
                returnElement = element;
            }
        }
        return returnElement;
    }
}
