package game.engine;

import game.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import static game.ui.GameView.sprite;

public class WorldHandler {
    public static boolean isMovingUp = false;
    public static boolean isMovingDown = false;
    public static boolean isMovingRight = false;
    public static boolean isMovingLeft = false;
    public static void startHandler(){
        new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isMovingDown){
                    Main.world.move(0,-3);
                }
                else if(isMovingUp){
                    Main.world.move(0,3);
                }
                else if(isMovingRight){
                    Main.world.move(-3,0);
                }
                else if(isMovingLeft){
                    Main.world.move(3,0);
                }
            }
        }).start();
        new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isMovingDown&&!isMovingUp) {
                    ImageIcon animations[] = new ImageIcon[2];
                    animations[0] = new ImageIcon("assets/images/sprite.png");
                    animations[1] = new ImageIcon("assets/images/sprite2.png");
                    sprite.playAnimation(100, animations);
                }
                if(isMovingUp&&!isMovingDown) {
                    ImageIcon animations[] = new ImageIcon[2];
                    animations[0] = new ImageIcon("assets/images/sprite3.png");
                    animations[1] = new ImageIcon("assets/images/sprite4.png");
                    sprite.playAnimation(100, animations);
                }
                if(isMovingRight&&!isMovingLeft) {
                    ImageIcon animations[] = new ImageIcon[2];
                    animations[0] = new ImageIcon("assets/images/sprite5.png");
                    animations[1] = new ImageIcon("assets/images/sprite6.png");
                    sprite.playAnimation(100, animations);
                }
                if(isMovingLeft&&!isMovingRight) {
                    ImageIcon animations[] = new ImageIcon[2];
                    animations[0] = new ImageIcon("assets/images/sprite7.png");
                    animations[1] = new ImageIcon("assets/images/sprite8.png");
                    sprite.playAnimation(100, animations);
                }
            }
        }).start();
    }
    public static void handle(KeyEvent e,boolean pressed){
        if(pressed) {
            if (e.getKeyCode() == KeyEvent.VK_UP) isMovingUp = true;
            if (e.getKeyCode() == KeyEvent.VK_DOWN) isMovingDown = true;
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) isMovingRight = true;
            if (e.getKeyCode() == KeyEvent.VK_LEFT) isMovingLeft = true;
        }
        else {
            if (e.getKeyCode() == KeyEvent.VK_UP) isMovingUp = false;
            if (e.getKeyCode() == KeyEvent.VK_DOWN) isMovingDown = false;
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) isMovingRight = false;
            if (e.getKeyCode() == KeyEvent.VK_LEFT) isMovingLeft = false;
        }
    }

}
