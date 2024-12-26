import javax.swing.*;
import java.awt.*;

public class MarqueeApp extends JFrame implements Runnable {

    private JLabel marqueeLabel;
    private Thread thread;
    private String text = "Java World! ";
    private int xPosition;

    public MarqueeApp() {
        setTitle("Marquee Application");
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        marqueeLabel = new JLabel(text);
        marqueeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        marqueeLabel.setBounds(0, 50, 600, 30);
        add(marqueeLabel);

        xPosition = getWidth();
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                xPosition -= 5;

                if (xPosition + marqueeLabel.getPreferredSize().width < 0) {
                    xPosition = getWidth();
                }

                marqueeLabel.setBounds(xPosition, 50, marqueeLabel.getPreferredSize().width, marqueeLabel.getPreferredSize().height);

                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
