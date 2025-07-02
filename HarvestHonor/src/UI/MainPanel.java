package UI;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel
{

    public static Image image = new ImageIcon(MainPanel.class.getResource("/Bilder/gräs.png")).getImage();
    //public static Image baseEnemy = new ImageIcon(MainPanel.class.getResource("/Bilder/gubbe.png")).getImage();
    //public ImageIcon baseEnemy = new ImageIcon("/Bilder/gubbe.png");
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
