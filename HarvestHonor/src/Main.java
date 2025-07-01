import UI.MainPanel;
import UI.Window;
import Units.Building;

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

    public static void main(String[] args)
    {
        window = new Window();
        panel = new MainPanel();
        building = new Building();

        setupGame();
    }

    public static void setupGame()
    {
        window.add(panel);
        panel.setup();
        window.setup();
        building.setup();

    }
}
