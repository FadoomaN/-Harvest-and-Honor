package UI;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel
{

    public static Image image = new ImageIcon(MainPanel.class.getResource("/Images/Grass.png")).getImage();
    //JLabel label = new JLabel(baseEnemy);

    public void setup()
    {
        //this.add(label);
        this.setPreferredSize(new Dimension(500, 500));
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawRect(0, 0, 200, 200);
        g.drawImage(image, 0, 0, this);
    }
}
