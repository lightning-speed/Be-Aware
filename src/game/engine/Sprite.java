package game.engine;

import javax.swing.*;
import java.awt.*;

public class Sprite extends JLabel {
    public Sprite(ImageIcon icon,int width,int height){
        super(icon);
        this.setSize(width,height);
    }
    public void playAnimation(int interval,ImageIcon icons[]){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i< icons.length;i++){
                    setIcon(icons[i]);
                    try {
                        Thread.sleep(interval);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
