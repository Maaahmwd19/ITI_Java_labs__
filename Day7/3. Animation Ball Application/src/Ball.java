import javax.swing.*;
import java.awt.*;

public class Ball extends JFrame implements Runnable {

    private Thread th;
    private JLabel ballLabel;
    private int xOffset = 0;
    private int yOffset = 0;
    private int xDirection = 1;
    private int yDirection = 1;

    public Ball() {
        setTitle("Ball Frame Application");
        setLayout(null);

        ballLabel = new JLabel(new ImageIcon("/home/mibrahim/java_labss/Day7/3. Animation Ball Application/ball.jpg"));
        ballLabel.setBounds(0, 0, 50, 50);
        add(ballLabel);

        th = new Thread(this);
        th.start();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 800, 600);
        setVisible(true);
    }

    private void moveBall() {
        xOffset += xDirection * 10;
        yOffset += yDirection * 10;

        if (xOffset > getWidth() - ballLabel.getWidth() || xOffset < 0) {
            xDirection *= -1;
        }

        if (yOffset + 25 > (getHeight() - ballLabel.getHeight()) || yOffset < 0) {
            yDirection *= -1;
        }

        ballLabel.setLocation(xOffset, yOffset);
    }

    @Override
    public void run() {
        while (true) {
            moveBall();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                break;
            }
        }
    }
}
