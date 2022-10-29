import javax.swing.*;
import java.util.Date;

public class LamdaTimer extends JFrame {
    public static void main(String[] args) {

        LamdaTimer lamdaTimer = new LamdaTimer();
        lamdaTimer.setTitle("Timer");
        lamdaTimer.setSize(300, 100);
        lamdaTimer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        lamdaTimer.add(label);

        lamdaTimer.setVisible(true);

        Timer timer = new Timer(1000, event -> {
            Date date = new Date();
            System.out.println(date.toString());
            label.setText(date.toString());
        });

        timer.start();

    }
}
