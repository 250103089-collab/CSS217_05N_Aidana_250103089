interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int level);
}
class TV implements Device {
    public void turnOn() {
        System.out.println("TV turns on.");
    }
    public void turnOff() {
        System.out.println("TV turns off.");
    }
    public void setVolume(int level) {
        System.out.println("TV volume set to: " + level);
    }
}
class SmartLight implements Device {
    public void turnOn() {
        System.out.println("Smart Light glows bright white.");
    }
    public void turnOff() {
        System.out.println("Smart Light shuts off.");
    }
    public void setVolume(int level) {
        System.out.println(
                "Smart Light brightness set to: " + level + "%"
        );
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
class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }
    public void mute() {
        System.out.println("[Remote] Mute button pressed!");
        device.setVolume(0);
    }
}
public class task4 {
    public static void main(String[] args) {
        Device light = new SmartLight();
        AdvancedRemote remote = new AdvancedRemote(light);
        remote.powerOn();
        remote.mute();
    }
}
