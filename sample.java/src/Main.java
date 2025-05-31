import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("What's your name?");
        JOptionPane.showMessageDialog(null, "Hello " +a);
        int b = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, "You're " +b+ " years old");
        double c = Double.parseDouble(JOptionPane.showInputDialog("What's your height? (in cm)"));
        JOptionPane.showMessageDialog(null, "You're " + c + " cm tall");
        JOptionPane.showMessageDialog(null, "Thanks for the information!😄");

    }
}