/**
 * Created by nsp on 2015/10/25.
 */
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class FlyweightTest extends JFrame {

    JButton startDrawing;

    int windowWidth = 1750;
    int windowHeight = 150;

    Color[] shapeColor = {
            Color.orange, Color.red, Color.yellow,
            Color.blue, Color.pink, Color.cyan, Color.magenta,
            Color.black, Color.gray
    };

    public static void main(String[] args) {
        new FlyweightTest();
    }

    public FlyweightTest() {
        this.setSize(this.windowWidth, this.windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight Test");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();

        startDrawing = new JButton("Draw Stuff");

        contentPanel.add(drawingPanel, BorderLayout.CENTER);
        contentPanel.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = drawingPanel.getGraphics();

                long startTime = System.currentTimeMillis();

                for (int i = 0; i < 1000000; ++i) {
                    MyRect rect = RectFactory.getRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
                }

                long endTime = System.currentTimeMillis();

                System.out.println("That took " + (endTime - startTime));
            }
        });

        this.add(contentPanel);
        this.setVisible(true);
    }

    private Color getRandColor() {
        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt(9);

        return this.shapeColor[randInt];
    }

    private int getRandX() {
        return (int)(Math.random() * this.windowWidth);
    }

    private int getRandY() {
        return (int)(Math.random() * this.windowHeight);
    }
}
