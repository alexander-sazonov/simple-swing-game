import javax.swing.*;
import java.awt.*;

public abstract class Sprite {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected Image image;
    protected boolean visible;

    public Sprite(int x, int y) {
        this.x = x;
        this.y = y;
        visible = true;
    }

    protected void loadImage(String imageName){
        ImageIcon imageIcon = new ImageIcon(imageName);
        image = imageIcon.getImage();
    }

    public abstract void move();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
