import javafx.scene.control.Button;

public class CustomerTm {
    private String name;
    private String nationalId;
    private String email;
    private String address;
    private Button button;

    public CustomerTm() {
    }

    public CustomerTm(String name, String nationalId, String email, String address, Button button) {
        this.name = name;
        this.nationalId = nationalId;
        this.email = email;
        this.address = address;
        this.button = button;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }
}
