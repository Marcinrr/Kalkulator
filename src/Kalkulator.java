import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator {
    private JPanel panel;
    private JButton CEbutton;
    private JButton Cbutton;
    private JButton kasujbutton;
    private JButton dzielbutton;
    private JButton siedembutton;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton osiembutton;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton dwabutton;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JTextField textField1;


    public Kalkulator() {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator");
        frame.setContentPane(new Kalkulator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
