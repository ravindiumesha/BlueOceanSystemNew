public class Room {

    private String roomID;
    private String roomType;
    private double roomCharges;
    private String floor;

    public Room() {
    }

    public Room(String roomID, String roomType, double roomCharges, String floor) {
        this.roomID = roomID;
        this.roomType = roomType;
        this.roomCharges = roomCharges;
        this.floor = floor;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomCharges() {
        return roomCharges;
    }

    public void setRoomCharges(double roomCharges) {
        this.roomCharges = roomCharges;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
}
