// import swing library to use GUI functions
import javax.swing.JOptionPane;

public class basicGUI {
    public static void main(String[] args) {
        // Dialog box for taking user input
        String name = JOptionPane.showInputDialog("Enter Your name ");
        // Dialog box for show user entered value
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age "));
        JOptionPane.showMessageDialog(null,"You are "+age+" years old");
    }
}
