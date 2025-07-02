package UI;

import Main.Main;

import javax.swing.*;
import java.awt.*;



public class MainPanel extends JPanel
{
    public static Image image = new ImageIcon(MainPanel.class.getResource("/Images/Grass.png")).getImage();


    public void setup()
    {
        this.setPreferredSize(new Dimension(Main.panelSizeX, Main.panelSizeY));
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, Main.panelSizeX, Main.panelSizeY, null);
        Main.refreshMainPanel(g);

    }
}
