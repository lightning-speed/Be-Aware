package game.internal;

import game.Main;
import game.engine.WorldHandler;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler {
    public static void start(){
        Main.win.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                WorldHandler.handle(e,true);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                WorldHandler.handle(e,false);
            }
        });
    }

}
