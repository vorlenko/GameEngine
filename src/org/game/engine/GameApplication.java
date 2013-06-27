/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.game.engine;

import javax.swing.JFrame;

/**
 *
 * @author VladimirO
 */
public class GameApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    static public void start (Game game) {
        JFrame frame = new JFrame(game.getTitle());
        frame.setSize(game.getWidth(), game.getHeight());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameCanvas canvas = new GameCanvas(game);
        frame.add(canvas);
        frame.setVisible(true);
        GameLoop loop = new GameLoop(game,canvas);
        loop.start();
    }
}
