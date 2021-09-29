package game.engine;

import game.Main;
import game.ui.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class World {
    public int pixelSize = 25;
    public int width;
    public int height;
    public JPanel worldPanel;
    public ImageIcon block_images[];
    public String block_id[];
    public  World(int width,int height,ImageIcon block_images[],String block_id[]){
        this.width = width;
        this.height = height;
        this.block_images = block_images;
        this.block_id =  block_id;
        worldPanel = new JPanel();
        worldPanel.setBounds(0,0,700*pixelSize,550*pixelSize);
        worldPanel.setLayout(null);
        Window.view.add(worldPanel);
    }
    public void render_world(){
        for(int i = 0;i<height;i++){
            for(int j = 0;j<width;j++){
                JLabel B = new JLabel(block_images[(i*width)+j]);
                B.setBounds(j*pixelSize,i*pixelSize,pixelSize,pixelSize);
                worldPanel.add(B);
            }
        }
        Main.win.update();
    }
    public void move(int X,int Y) {
     worldPanel.setLocation(worldPanel.getX()+X,worldPanel.getY()+Y);
    }
}
