public class Room {
    double width;
    double length;

    public Room(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Room(Room room) {
        this.width = room.width;
        this.length = room.length;
    }
}

