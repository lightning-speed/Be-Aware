package game.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Window extends JFrame {
    public static GameView view  = new GameView(100,100);
    public Window(){
        super("Be Aware");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(700,550);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(view);

    }
    public void update(){
        this.setSize(700,551);
        this.setSize(700,550);
    }
}
