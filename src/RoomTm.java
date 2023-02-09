import javafx.scene.control.Button;

import java.awt.*;

public class RoomTm {

    private String roomID;
    private String roomType;
    private double roomCharges;
    private String floor;
    private Button button;

    public RoomTm() {
    }

    public RoomTm(String roomID, String roomType, double roomCharges, String floor, Button button) {
        this.roomID = roomID;
        this.roomType = roomType;
        this.roomCharges = roomCharges;
        this.floor = floor;
        this.button = button;
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

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }
}
