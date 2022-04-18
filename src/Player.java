import javax.swing.event.MenuKeyEvent;
import java.awt.event.KeyEvent;

public class Player extends Sprite {
    private int dx;
    private int dy;

    public Player(int x, int y) {
        super(x, y);
        loadImage("src/smile.png");
    }

    @Override
    public void move() {
        x = x + dx;
        y = y + dy;
    }

    public void keyPressed(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            dx = -2;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            dx = 2;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP){
            dy = 2;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN){
            dy = -2;
        }
    }

    public void keyReleased(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            dx = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            dx = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP){
            dy = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN){
            dy = 0;
        }
    }
}
