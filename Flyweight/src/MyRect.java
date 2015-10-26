import java.awt.*;
/**
 * Created by nsp on 2015/10/25.
 */

public class MyRect {
    private Color color;
    private int x, y, x2, y2;

    public MyRect(Color color) {
        this.color = color;
    }

    public void draw(Graphics g, int upperX, int upperY, int lowerX, int lowerY) {
        g.setColor(this.color);

        g.fillRect(upperX, upperY, lowerX, lowerY);

    }

    /*public MyRect(Color color, int upperX, int upperY, int lowerX, int lowerY) {
        this.color = color;

        this.x = upperX;
        this.y = upperY;

        this.x2 = lowerX;
        this.y2 = lowerY;
    }

    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillRect(this.x, this.y, this.x2, this.y2);

    }*/
}
