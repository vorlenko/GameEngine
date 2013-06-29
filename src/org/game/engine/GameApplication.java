/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.game.engine;

import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author VladimirO
 */
public class GameApplication {

        
    public static void start(final Game game) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new JFrame(game.getTitle());
				//frame.setSize(game.getWidth(), game.getHeight());
                                frame.setBounds(new Rectangle(game.getWidth()+14, 
                                        game.getHeight()+30));//This need for my computer.
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				GameCanvas canvas = new GameCanvas();
				canvas.setGame(game);
				frame.add(canvas);
				frame.setVisible(true);
				canvas.requestFocus();
				new GameLoop(game, canvas).start();
			}
		});
	}
}
