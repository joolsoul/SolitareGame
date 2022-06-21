package org.example.view;

import javax.swing.*;
import java.awt.*;

public class FrameWindow extends JFrame {

    public FrameWindow() {
        setTitle("Solitaire");
        setSize(1616, 100);
        setMinimumSize(new Dimension(1616, 1));
        ImageIcon icon = new ImageIcon("src/main/resources/appIcon.png");
        setIconImage(icon.getImage());
        add(new MainPanel());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
