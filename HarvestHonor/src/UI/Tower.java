package UI;

import Main.Main;

import java.awt.*;

public class Tower
{
    int hp;
    int cost;
    boolean destroyed = false;

    public void destroy()
    {
        destroyed = true;
    }

    public void refresh(Graphics g)
    {
        if (destroyed == false)
        {
            g.setColor(new Color(150, 75, 0));
            g.fillRect(Main.panelSizeX/2 - 50 + Main.timerCounter/100, Main.panelSizeY/2 - 50, 100, 100);

        }
        else
        {
            g.setColor(new Color(0, 0, 0));
            g.fillRect(Main.panelSizeX/2 - 50, Main.panelSizeY/2 - 50, 100, 100);
        }
    }

    public void shoot(int x, int y, Graphics g)
    {
        int currentX = Main.panelSizeX/2, currentY = Main.panelSizeY/2;

    }
}
