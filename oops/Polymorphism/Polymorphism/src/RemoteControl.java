interface Device {
    void powerOff();
}

class TV implements Device {
    public void powerOff() { System.out.println("TV is now OFF"); }
}

public class RemoteControl {
    public static void main(String[] args) {
        Device myTv = new TV();
        myTv.powerOff();
    }
}