import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vm {
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtMarks5;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JTextField txtMarks4;
    private JButton button1;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("vm");
        frame.setContentPane(new vm().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public vm() {
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int m1,m2,m3,m4,m5,tot;
                double avg;


                m1 = Integer.parseInt(txtMarks1.getText());
                m2 = Integer.parseInt(txtMarks2.getText());
                m3 = Integer.parseInt(txtMarks3.getText());
                m4 = Integer.parseInt(txtMarks4.getText());
                m5 = Integer.parseInt(txtMarks5.getText());

                tot = m1+m2+m3+m4+m5;

                txtTotal.setText(String.valueOf(tot));


                avg = tot/5;

                txtAvg.setText(String.valueOf(avg));



            }
        });
    }
}
