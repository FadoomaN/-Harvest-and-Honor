package Main;

import UI.House;
import UI.MainPanel;
import UI.Tower;
import UI.Window;

import javax.swing.*;
import java.awt.*;

/**
 *  Daniel, Fadi, Raymi, Mohmad
 *  Harvest & Honor
 */
public class Main
{
    //doodoo fart

    public static Window window;
    public static MainPanel panel;
    public static House house;
    public static int timerCounter = 0;
    public static int panelSizeX = 1500, panelSizeY = 900;
    public static Tower tower = new Tower();

    public static void main(String[] args)
    {
        window = new Window();
        panel = new MainPanel();
        house = new House();

        setupGame();
    }

    public static void setupGame()
    {
        window.add(panel);
        panel.setup();

        panel.add(house);
        house.setup();

        //End
        window.setup();

        Thread timer = new Thread(new Runnable()
        {
            public void run()
            {
                runGame();
            }
        }
        );
        timer.start();

    }

    public static void runGame()
    {
        while(true)
        {
            window.repaint();
            try
            {
                Thread.sleep(20);
                timerCounter+= 20;
                if(timerCounter % 1000 == 0)
                {
                    System.out.println(Math.round(timerCounter/1000));
                }
            }
            catch (Exception e)
            {
                System.out.println("fel i main");
                e.printStackTrace();
            }
        }
    }

    public static void refreshMainPanel(Graphics g)
    {
        tower.refresh(g);
        if (timerCounter == 5)
        {
            tower.destroy();
        }
    }
}
