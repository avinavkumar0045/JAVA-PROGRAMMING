public class GameController {
    // TODO: Instance variables for controller configuration
    private String controllerBrand;
    private String connectionType;
    private boolean hasVibration;
    private int batteryLevel;
    private double sensitivity;

 
    // TODO: Default constructor - creates standard gaming setup
    public GameController() {
    // TODO: Set default values:
    controllerBrand = "GenericPad";
    connectionType = "USB";
    hasVibration = true;
    batteryLevel = 100;
    sensitivity = 1.0;

    }
    // TODO: Parameterized constructor for custom configuration
    public GameController(String controllerBrand, String
    connectionType,
    boolean hasVibration, int batteryLevel,
    double sensitivity) {
        this.controllerBrand = controllerBrand;
        this.connectionType = connectionType;
        this.hasVibration = hasVibration;
        this.sensitivity = sensitivity;
    
    }
    public void calibrateController() {
        System.out.println("Calibrating " + controllerBrand + "controller...");
    }


    public void displayConfiguration() {
        // TODO: Print all controller settings
    }
    public void testVibration() {
        if (hasVibration) {
        System.out.println("*BUZZ* Vibration test successful!");
        }
        else {
            System.out.println("Vibration disabled on this controller.");
        }
    }

    public static void main(String args[]){
        GameController a = new GameController();
        GameController b = new GameController("Dogesh" , "USB", false, 12 , 0.5);

        a.calibrateController();
        a.testVibration();
    }
}
