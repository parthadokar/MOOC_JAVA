package part4;

public class Agent {
    private String firstName;
    private String lastName;

    public Agent (String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public String print() {
        return "My name is " + this.lastName + ", " + this.firstName + " " +this.lastName;
    }
}
