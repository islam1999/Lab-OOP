package ru.mirea.lab6;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main extends JFrame {

    public static void createGUI() {

        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Times New Roman", Font.PLAIN, 15);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Цвет");
            JMenuItem blueItem = new JMenuItem("Синий");
                blueItem.setFont(font);
                fileMenu.add(blueItem);
            JMenuItem redItem = new JMenuItem("Красный");
                redItem.setFont(font);
                fileMenu.add(redItem);
            JMenuItem blackItem = new JMenuItem("Черный");
                blackItem.setFont(font);
                fileMenu.add(blackItem);
         fileMenu.addSeparator();

        JMenu shriftMenu = new JMenu("Шрифт");
            JMenuItem shrift1Item = new JMenuItem("Times New Roman");
                shrift1Item.setFont(font);
                shriftMenu.add(shrift1Item);
            JMenuItem shrift2Item = new JMenuItem("MS Sans Serif");
                shrift2Item.setFont(font);
                shriftMenu.add(shrift2Item);
            JMenuItem shrift3Item = new JMenuItem("Courier New");
                shrift3Item.setFont(font);
                shriftMenu.add(shrift3Item);
        shriftMenu.addSeparator();

        //shriftMenu.setFont(font);
        shriftMenu.addSeparator();

        menuBar.add(fileMenu);
        menuBar.add(shriftMenu);
        frame.setJMenuBar(menuBar);

        frame.setPreferredSize(new Dimension(500, 400));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI();
            }
        });
    }
}
