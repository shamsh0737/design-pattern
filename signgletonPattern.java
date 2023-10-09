public class TVRemoteControl {
    private boolean powerOn;
    private int volume;
    private int channel;

    public TVRemoteControl() {
        initialize();
    }

    private void initialize() {
        powerOn = false;
        volume = 0;
        channel = 1;
    }

    public void power() {
        powerOn = !powerOn;
    }

    public void increaseVolume() {
        if (powerOn) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (powerOn && volume > 0) {
            volume--;
        }
    }

    public void setChannel(int channel) {
        if (powerOn) {
            this.channel = channel;
        }
    }

    public void getStatus() {
        System.out.println("Power: " + (powerOn ? "On" : "Off"));
        System.out.println("Volume: " + volume);
        System.out.println("Channel: " + channel);
    }

    public static void main(String[] args) {
        // Create separate user profiles
        TVRemoteControl user1Remote = new TVRemoteControl();
        TVRemoteControl user2Remote = new TVRemoteControl();

        // User 1 controls the TV
        user1Remote.power();
        user1Remote.increaseVolume();
        user1Remote.setChannel(5);
        user1Remote.getStatus();

        // User 2 controls the TV
        user2Remote.power();
        user2Remote.decreaseVolume();
        user2Remote.setChannel(3);
        user2Remote.getStatus();
    }
}
