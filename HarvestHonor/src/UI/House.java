package UI;

import javax.swing.*;
import java.awt.*;

public class House extends JPanel
{
    private Image house ;

    public void setup()
    {
        house = new ImageIcon(House.class.getResource("/Images/House.png")).getImage();
        int width = house.getWidth(null)/3;
        int height = house.getHeight(null)/3;
        setBounds(0,0, width, height);
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(house, 0, 0, getWidth(), getHeight(), null);
    }
}
