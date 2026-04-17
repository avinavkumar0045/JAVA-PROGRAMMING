import java.awt.*;
import javax.swing.*; // <-- needed for Component.CENTER_ALIGNMENT

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing App");
        JButton button = new JButton("Click Me!");
        JLabel textLabel = new JLabel("This is 1st L...");
        JCheckBox chkBox = new JCheckBox("Java Swing", true);
        JCheckBoxMenuItem item = new JCheckBoxMenuItem("Option_1");
        JMenuBar menu_bar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        menuItem1 = new JMenuItem("Never");
        menuItem2 = new JMenuItem("Stop");
        menuItem3 = new JMenuItem("Learing");

        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // vertical stack


        // Optional: center align components
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        textLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        chkBox.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(button);
        panel.add(textLabel);
        panel.add(chkBox);

        frame.add(panel);
        frame.setVisible(true);
    }
}
