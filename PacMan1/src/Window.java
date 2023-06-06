import javax.swing.JFrame;

public class Window extends JFrame {
//Pacman
    public  Window() {
        add(new Board());
        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setLocationRelativeTo(null);
    }


}
