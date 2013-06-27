/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.game.engine;

import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author VladimirO
 */
class GameCanvas extends JComponent{
    private final Game game;

    public GameCanvas(Game game) {
        this.game = game;
        addKeyListener(this.game);
        addMouseListener(this.game);
        addMouseMotionListener(this.game);
        requestFocus();
    }

    @Override
    protected void paintComponent(Graphics g) {
        //super.paintComponent(g);
        game.draw(g);
    }
    
}
