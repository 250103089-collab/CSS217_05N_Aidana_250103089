interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int level);
}
class Radio implements Device {
    public void turnOn() {
        System.out.println("Radio starts playing static/music.");
    }
    public void turnOff() {
        System.out.println("Radio turns off.");
    }
    public void setVolume(int level) {
        System.out.println("Radio volume knob turned to: " + level);
    }
}
class BasicRemote {
    protected Device device;
    public BasicRemote(Device device) {
        this.device = device;
    }
    public void powerOn() {
        device.turnOn();
    }
    public void powerOff() {
        device.turnOff();
    }
}
class PartyRemote extends BasicRemote {
    public PartyRemote(Device device) {
        super(device);
    }
    public void partyMode() {
        System.out.println("[Party Remote] Pumping up the party!");
        device.turnOn();
        device.setVolume(100);
    }
}
public class task5 {
    public static void main(String[] args) {
        Radio radio = new Radio();
        PartyRemote remote = new PartyRemote(radio);
        remote.partyMode();
    }
}
