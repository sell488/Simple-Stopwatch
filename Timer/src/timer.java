/**
 * Created by sell4_8aha on 11/4/2017.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class timer extends JFrame implements ActionListener{

    private JTextField sec1;
    private JTextField min1;

    private JLabel secLab;
    private JLabel minLab;

    private int time = 0;
    private Timer count;

    private JButton start;
    private JButton stop;

    public static void main (String[] args) {
        timer frame = new timer();
        frame.setSize(300,100);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        minLab = new JLabel("Minutes: ");
        window.add(minLab);

        min1 = new JTextField(2);
        window.add(min1);

        secLab = new JLabel("Seconds: ");
        window.add(secLab);

        sec1 = new JTextField(2);
        window.add(sec1);

        count = new Timer(1000, this);
        count.start();

        start = new JButton("Start Timer");
        window.add(start);
        start.addActionListener(this);

        stop = new JButton("Stop");
        window.add(stop);
        stop.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        boolean start1;

        time = time + 1;

        if(event.getSource() == start) {
            start1 = true;
        }

            if (start1 = true) {
                min1.setText(Integer.toString(time / 60));
                sec1.setText(Integer.toString(time % 60));



            }






        if(event.getSource() == stop) {
            start1 = false;
        }

            if (start1 = false) {
                time = time;
                min1.setText(Integer.toString(time / 60));
                sec1.setText(Integer.toString(time % 60));
            }



    }
}
