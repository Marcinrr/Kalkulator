import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.DoubleBinaryOperator;

public class Kalkulator {
    private JPanel panel;
    private JButton CEbutton;
    private JButton Cbutton;
    private JButton kasujbutton;
    private JButton dzielbutton;
    private JButton siedembutton;
    private JButton czterybutton;
    private JButton jedenbutton;
    private JButton plusminusbutton;
    private JButton osiembutton;
    private JButton dziewiecbutton;
    private JButton mnozeniebutton;
    private JButton piecbutton;
    private JButton szescbutton;
    private JButton minusbutton;
    private JButton dwabutton;
    private JButton trzybutton;
    private JButton plusbutton;
    private JButton zerobutton;
    private JButton przecinekbutton;
    private JButton rownasiebutton;
    private JTextArea textArea1;
    private JLabel label;
    private Double liczba=0.0;
    private Double liczba2=0.0;
    private boolean[]działania=new boolean[4];

    private void clearlabel(){
        if (label.getText().contains(".0")){

            label.setText(label.getText().replace(".0", ""));
        }
    }

    private void clearta(){
        if (textArea1.getText().endsWith(".0")){
            textArea1.setText(textArea1.getText().replace(".0", ""));
        }
    }

    public Kalkulator() {
        textArea1.setSize(235,20);



        CEbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");

            }
        });
        Cbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
                label.setText("");
                liczba=0.0;

            }
        });
        kasujbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText().substring(0, textArea1.getText().length() - 1));

            }
        });
        dzielbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczba= Double.valueOf(textArea1.getText());
                textArea1.setText("");
                label.setText(liczba+" /");
                działania[3]=true;
                clearlabel();

            }
        });
        siedembutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textArea1.getText().length()>=10) return;
                if (textArea1.getText().isEmpty()) {
                    textArea1.setText("7");
                }
                else textArea1.append("7");

            }
        });
        osiembutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textArea1.getText().length()>=10) return;
                if (textArea1.getText().isEmpty()) {
                    textArea1.setText("8");
                }
                else textArea1.append("8");

            }
        });
        dziewiecbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textArea1.getText().length()>=10) return;
                if (textArea1.getText().isEmpty()) {
                    textArea1.setText("9");
                }
                else textArea1.append("9");

            }
        });
        mnozeniebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczba= Double.valueOf(textArea1.getText());
                textArea1.setText("");
                label.setText(liczba+" *");
                działania[2]=true;
                clearlabel();

            }
        });
        czterybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textArea1.getText().length()>=10) return;
                if (textArea1.getText().isEmpty()) {
                    textArea1.setText("4");
                }
                else textArea1.append("4");

            }
        });


        piecbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textArea1.getText().length()>=10) return;
                if (textArea1.getText().isEmpty()) {
                    textArea1.setText("5");
                }
                else textArea1.append("5");

            }
        });
        szescbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textArea1.getText().length()>=10) return;
                if (textArea1.getText().isEmpty()) {
                    textArea1.setText("6");
                }
                else textArea1.append("6");

            }
        });

        jedenbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textArea1.getText().length()>=10) return;
                if (textArea1.getText().isEmpty()) {
                    textArea1.setText("1");
                }
                else textArea1.append("1");

            }

        });
        dwabutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textArea1.getText().length()>=10) return;
                if (textArea1.getText().isEmpty()) {
                    textArea1.setText("2");
                }
                else textArea1.append("2");
            }
        });

        trzybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textArea1.getText().length()>=10) return;
                if (textArea1.getText().isEmpty()) {
                    textArea1.setText("3");
                }
                else textArea1.append("3");
            }
        });

        zerobutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textArea1.getText().length()>=10) return;
                if (textArea1.getText().isEmpty()) {
                    textArea1.setText("0");
                }
                else textArea1.append("0");
            }
        });
        plusminusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(String.valueOf(Double.valueOf(textArea1.getText())*(-1)));
                clearta();


            }
        });
        przecinekbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textArea1.getText().contains(".")) return;
                textArea1.append(".");

            }
        });
        rownasiebutton.addActionListener(new ActionListener() {
            @Override
                  public void actionPerformed(ActionEvent e) {
                liczba2= Double.valueOf(textArea1.getText());
                if(działania[0]){
                    textArea1.setText(String.valueOf(liczba+liczba2));
                }
                else if (działania[1]){
                    textArea1.setText(String.valueOf(liczba-liczba2));
                }
                else if (działania[2]){
                    textArea1.setText(String.valueOf(liczba*liczba2));
                }
                else if (działania[3]){
                    textArea1.setText(String.valueOf(liczba/liczba2));
                }
                clearta();
                label.setText("");
                for (int i = 0; i <działania.length ; i++) {
                    działania[i]=false;
                }

            }
        });
        plusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczba= Double.valueOf(textArea1.getText());
                textArea1.setText("");
                label.setText(liczba+" +");
                działania[0]=true;
                clearlabel();




            }
        });
        minusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczba= Double.valueOf(textArea1.getText());
                textArea1.setText("");
                label.setText(liczba+" -");
                działania[1]=true;
                clearlabel();

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator");
        frame.setContentPane(new Kalkulator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
