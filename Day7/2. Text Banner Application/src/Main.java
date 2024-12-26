import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MarqueeApp app = new MarqueeApp();
            app.setVisible(true);
        });
    }
}
