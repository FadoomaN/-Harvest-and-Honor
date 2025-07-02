package UI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu {

    protected static JFrame menu;
    protected static JPanel menuPanel;
    protected static JButton startGameBtn;
    protected static JButton closeGameBtn;

    public Menu()
    {
        windowStarter();
    }


    /**
     * This is a method that starts the frame of the menu
     */
    protected static void windowStarter()
    {
        menu = new JFrame("Harvest and Honor");
        menu.setBounds(500,500, 500,800);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setLayout(null);
        menu.setResizable(false);
        menu.setVisible(true);
        System.out.println("The menu window is created");

        setupMenuPanel();

    }


    /**
     * This method makes a panel for the menu where everything is going to be added on
     */
    public static void setupMenuPanel()
    {
        menuPanel = new JPanel();
        menuPanel.setBounds(10,10, 465,740);
        menuPanel.setLayout(null);
        menuPanel.setBackground(new Color(213, 213, 100));
        menu.add(menuPanel);
        System.out.println("Jpanel for menu created");

        setupMenuButtons();
    }



    public static void setupMenuButtons()
    {
        // setting up game start button
        startGameBtn = new JButton("Start");
        startGameBtn.setBounds(25,590, 100, 50);
        startGameBtn.setVisible(true);
        startGameBtn.setBackground(Color.RED);
        menuPanel.add(startGameBtn);

        // Setting up close button
        closeGameBtn = new JButton("Close");
        closeGameBtn.setBounds(335, 590, 100,50);
        closeGameBtn.setBackground(Color.BLUE);
        closeGameBtn.setVisible(true);
        closeGameBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuPanel.add(closeGameBtn);

        //Refresh the menu Panel
        menuPanel.revalidate();
        menuPanel.repaint();

    }
}
