import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class animacao_timer_swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Animation Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton("Move me");
        button.setBounds(50, 50, 100, 30);
        frame.add(button);

        Timer timer = new Timer(10, new ActionListener() {
            private int x = 50;
            @Override
            public void actionPerformed(ActionEvent e) {
                x += 1;
                if (x > frame.getWidth() - button.getWidth()) {
                    x = 50;
                }
                button.setLocation(x, button.getY());
            }
        });
        timer.start();

        frame.setVisible(true);
    }
}
