package game;

import game.engine.World;
import game.engine.WorldHandler;
import game.internal.KeyHandler;
import game.ui.Window;

import javax.swing.*;

public class Main {
    public static Window win;
    public static World world;
    public static void main(String args[]){
        ImageIcon icons[] = new ImageIcon[10000];
        for(int i = 0;i<10000;i++){
            icons[i]=new ImageIcon("assets/images/tile.png");
        }
       win = new Window();
        world = new World(50,50,icons,null);
        world.pixelSize = 25;
        world.render_world();
        KeyHandler.start();
        WorldHandler.startHandler();

    }
}
