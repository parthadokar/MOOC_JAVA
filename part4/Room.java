package part4;

public class Room {
    private String code;
    private int numberOfSeats;

    public Room (String code, int numberofSeats) {
        this.code = code;
        this.numberOfSeats = numberofSeats;
    }

    public void printRoomDetails() {
        System.out.println(this.code + " belongs to the groom " + this.numberOfSeats + " is the capacity of the room");
    }
}
