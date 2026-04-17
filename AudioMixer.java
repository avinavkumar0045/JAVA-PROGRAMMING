public class AudioMixer {
    private String mixerModel;
    private int numberOfChannels;
    private boolean hasBluetoothConnectivity;
    private double maxVolumeDecibels;
    private String[] connectedDevices;
    private int deviceCount;
    // TODO: No-argument constructor using this() chaining
    public AudioMixer() {
    // TODO: Call three-parameter constructor with defaults:
    // - model: "StandardMix-8"
    // - channels: 8
    // - bluetooth: false
    }
    // TODO: Two-parameter constructor using this() chaining
    public AudioMixer(String mixerModel, int numberOfChannels) {
    // TODO: Call three-parameter constructor with bluetooth disabled
    }
    // TODO: Three-parameter constructor using this() chaining
    public AudioMixer(String mixerModel, int numberOfChannels,
    boolean hasBluetoothConnectivity) {
    // TODO: Call main constructor with default max volume 120.0)
    
    4
    
    }
    // TODO: Main constructor - all parameters
    public AudioMixer(String mixerModel, int numberOfChannels,
    boolean hasBluetoothConnectivity, double
    maxVolumeDecibels) {
    // TODO: Initialize all fields
    // TODO: Initialize connectedDevices array based on  numberOfChannels
    // TODO: Set deviceCount to 0
    // TODO: Print constructor execution message
    }
    public void connectDevice(String deviceName) {
    if (deviceCount < connectedDevices.length) {
    connectedDevices[deviceCount] = deviceName;
    deviceCount++;
    System.out.println("Connected: " + deviceName);
    } else {
    System.out.println("All channels occupied!");
    }
    }
    public void displayMixerStatus() {
    System.out.println("\n=== " + mixerModel + " STATUS ===");
    System.out.println("Channels: " + numberOfChannels);
    System.out.println("Bluetooth: " + (hasBluetoothConnectivity
    ? "Enabled" : "Disabled"));
    System.out.println("Max Volume: " + maxVolumeDecibels + " dB");
    System.out.println("Connected Devices: " + deviceCount + "/"
    + numberOfChannels);
    for (int i = 0; i < deviceCount; i++) {
    System.out.println(" Channel " + (i + 1) + ": " +
    connectedDevices[i]);
    }
    
    5
    
    }
    public static void main(String[] args) {
    System.out.println("=== MUSIC STUDIO SETUP ===");
    // TODO: Create mixer using no-argument constructor
    // TODO: Create mixer using two-parameter constructor
    // TODO: Create mixer using three-parameter constructor
    // TODO: Create mixer using full constructor
    // TODO: Connect different devices to each mixer
    // TODO: Display status of all mixers
    // TODO: Comment on constructor chaining execution order
    }
    }