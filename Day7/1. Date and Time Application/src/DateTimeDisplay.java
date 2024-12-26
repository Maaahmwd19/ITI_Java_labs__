import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeDisplay {

    private JFrame frame;
    private JLabel dateTimeLabel;

    public DateTimeDisplay() {
        // Create the frame
        frame = new JFrame("Date and Time Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);
        frame.setLayout(new BorderLayout());

        // Create the label to display date and time
        dateTimeLabel = new JLabel();
        dateTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        dateTimeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(dateTimeLabel, BorderLayout.CENTER);

        // Center the frame on screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Start the clock
        updateDateTime();
    }

    private void updateDateTime() {
        // Create a thread to update the time every second
        new Thread(() -> {
            while (true) {
                // Get the current date and time
                String dateTime = new SimpleDateFormat("EEEE, MMMM d, yyyy HH:mm:ss").format(new Date());
                // Update the label
                dateTimeLabel.setText(dateTime);
                try {
                    Thread.sleep(1000); // Wait for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
