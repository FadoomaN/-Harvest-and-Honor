import UI.MainPanel;
import UI.Window;
import Units.Building;
import Units.Enemy;
import Units.EnemySoldier;

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
    public static Building building;
    public static Enemy[] enemySoldiers;

    public static void main(String[] args)
    {
        window = new Window();
        panel = new MainPanel();
        building = new Building();
        enemySoldiers =  new EnemySoldier[10];

        setupGame();
    }

    public static void setupGame()
    {
        panel.setup();
        window.add(panel);
        window.setup();
        building.setup();

    }
}
