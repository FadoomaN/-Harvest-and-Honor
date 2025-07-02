import UI.MainPanel;
import UI.Window;
import UI.House;

/**
 *  Daniel, Fadi, Raymi, Mohmad
 *  Harvest & Honor
 */
public class Main
{
    //doodoo fart

    public static Window window;
    public static MainPanel panel;
    public static House building;

    public static void main(String[] args)
    {
        window = new Window();
        panel = new MainPanel();
        building = new House();

        setupGame();
    }

    public static void setupGame()
    {
        window.add(panel);
        panel.setup();

        panel.add(building);
        building.setup();

        window.setup();
    }
}
