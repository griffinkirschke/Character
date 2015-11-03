/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Griffin Kirschke
 */
class CharacterEnvironment extends Environment {

    private Kirby kirbyLarge, kirbySmall;
    
    public CharacterEnvironment() {
        kirbyLarge = new Kirby(50, 50, 400, 400);
        kirbySmall = new Kirby(500, 50, 200, 200);
        this.setBackground(Color.CYAN);
    }

    @Override
    public void initializeEnvironment() {
        
    }

    @Override
    public void timerTaskHandler() {
        
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
        
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
        
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (kirbyLarge != null) {
            kirbyLarge.draw(graphics);
        }
        
        if (kirbySmall != null) {
            kirbySmall.draw(graphics);
        }
    }
    
}
