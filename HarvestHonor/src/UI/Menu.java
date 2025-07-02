package UI;

import java.awt.*;
import javax.swing.*;

public class Menu {

    protected static JFrame menu;
    protected static JPanel menuPanel;
    protected static JButton startGame;
    protected static JButton closeGame;

    public Menu()
    {
        windowStarter();
    }


    /**
     * This is a method that starts the frame of the menu
     *
     */
    protected static void windowStarter()
    {
        menu = new JFrame("Harvest and Honor");
        menu.setBounds(300,300, 1000,500);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setLayout(null);
        menu.setVisible(true);
        System.out.println("The menu window is created");

        setupMenuPanel();

    }


    public static void setupMenuPanel()
    {
        menuPanel = new JPanel();
        menuPanel.setBounds(0,0, 900,450);
        menuPanel.setLayout(null);
        menuPanel.setBackground(new Color(245, 245, 220));
        menu.add(menuPanel);
        System.out.println("Jpanel for menu created");
    }

}
