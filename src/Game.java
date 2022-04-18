import javax.swing.*;
import java.awt.*;
import java.awt.desktop.QuitEvent;

public class Game extends JFrame {

    public Game() {
        initUI();
    }

    private void initUI() {

        add(new Board());

        setTitle("Game");
        setSize(400, 300);

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Game game = new Game();
                game.setVisible(true);
            }
        });
    }
}
