import java.awt.*;

public class Main {
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new Window();
            ex.setVisible(true);
        });
    }
}