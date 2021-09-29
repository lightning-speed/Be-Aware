package game.ui;

import game.engine.Sprite;

import javax.swing.*;

public class GameView extends JPanel {
    public static Sprite sprite   = new Sprite(new ImageIcon("assets/images/sprite.png"),30,30);
    public GameView(int width,int height){
        setLayout(null);
        setBounds(0,0,width,height);
        sprite.setLocation((int)685/2,(int)535/2);
        add(sprite);

    }
}
