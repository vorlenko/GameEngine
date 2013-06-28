/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.game.engine;

import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JComponent;

/**
 *
 * @author VladimirO
 */
class GameCanvas extends JComponent implements ComponentListener{

    private Game game;

    public GameCanvas(/*Game game*/) {
        this.game = game;
        addKeyListener(this.game);
        addMouseListener(this.game);
        addMouseMotionListener(this.game);
        requestFocus();
        addComponentListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        //super.paintComponent(g);
        game.draw(g);
    }

    void setGame(Game game) {
        this.game = game;
        addKeyListener(game);
        addMouseListener(game);
        addMouseMotionListener(game);
        requestFocus();
        addComponentListener(this);
    }

    @Override
    public void componentResized(ComponentEvent ce) {
        game.resize(ce.getComponent().getWidth(), ce.getComponent().getHeight());
    }

    @Override
    public void componentMoved(ComponentEvent e) {}

    @Override
    public void componentShown(ComponentEvent e) {}

    @Override
    public void componentHidden(ComponentEvent e) {}
}
