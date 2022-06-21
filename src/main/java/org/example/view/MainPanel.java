package org.example.view;

import org.w3c.dom.ls.LSOutput;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainPanel extends JPanel implements MouseListener, MouseMotionListener
{

    private final int HORIZONTAL_INACCURACY = 0;
    private final int VERTICAL_INACCURACY = 0;

    private  int currentHeight = 0;
    private int currentWidth = 0;

    private final double cardHeightCoefficient = 0;
    private final double cardWidthCoefficient = 12.8;

    private final double gameDeckXCoefficient = 6.7300;
    private final double gameDeckYCoefficient = 0;

    private final double openCardXCoefficient = 3.9580;
    private final double openCardYCoefficient = 0;

    private Map<Integer, Double> startFoundationXCoefficients = new HashMap<>();
    private Map<Integer, Double> startFoundationYCoefficients = new HashMap<>();

    private Map<Integer, Double> startStackXCoefficients = new HashMap<>();
    private Map<Integer, Double> startStackYCoefficients = new HashMap<>();



    public MainPanel() {
        startFoundationXCoefficients.put(1, 2.1690);
        startFoundationXCoefficients.put(2, 1.7690);
        startFoundationXCoefficients.put(3, 1.4940);
        startFoundationXCoefficients.put(4, 1.2929);

        setLayout(null);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        currentHeight = this.getHeight();
        currentWidth = this.getWidth();
        System.out.println("h" + currentHeight + 'w' + currentWidth); //TODO test
        int test = (int) (1920 / 1.2929);
        System.out.println(test);

        Graphics2D graphics = (Graphics2D) g;

        try {
            Image background = ImageIO.read(new File("src/main/resources/background.jpg"));
            graphics.drawImage(background, 0, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

            try {

                Image image = ImageIO.read(new File("src/main/resources/back_dark.png"));
                graphics.drawImage(image, (int) (currentWidth/gameDeckXCoefficient), 0, (int) (currentWidth/cardWidthCoefficient), 220, null);

                Image image2 = ImageIO.read(new File("src/main/resources/back_dark.png"));
                graphics.drawImage(image2, (int) (currentWidth/openCardXCoefficient), 0, (int) (currentWidth/cardWidthCoefficient), 220, null);

            } catch (IOException e) {
                e.printStackTrace();
            }

        for (int i = 1; i < 5; i++) {

            try {
                Image image = ImageIO.read(new File("src/main/resources/back_light.png"));
                graphics.drawImage(image, (int) (currentWidth/startFoundationXCoefficients.get(i)), 0, (int) (currentWidth/cardWidthCoefficient), 220, null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private void paintFieldElements(Graphics2D graphics)
    {

    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
