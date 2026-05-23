import java.util.ArrayList;

public class Room {
    ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person returnPerson = this.persons.get(0);

        for (Person person : this.persons) {
            if (returnPerson.getHeight() > person.getHeight()) {
                returnPerson = person;
            }
        }
        return returnPerson;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }

        int shortestIndex = 0;

        for (int i = 1; i < this.persons.size(); i++) {
            if (this.persons.get(i).getHeight() < this.persons.get(shortestIndex).getHeight()) {
                shortestIndex = i;
            }
        }
        return this.persons.remove(shortestIndex);
    }
}
