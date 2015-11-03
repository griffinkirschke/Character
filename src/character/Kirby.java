/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Griffin Kirschke
 */
public class Kirby {

    public Kirby(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics graphics) {
        
        //background
        graphics.setColor(Color.GREEN);
        graphics.fillRect(0, 470, 900, 200);


        //outline
        graphics.setColor(Color.red);
        graphics.drawRect(x, y, width, height);

        //body
        graphics.setColor(Color.PINK);
        graphics.fillOval(x, y, width, height);

        //feet
        graphics.setColor(Color.red);
        graphics.fillOval(x + (width * 60 / 100), y + (height * 85 / 100), width * 35 / 100, height * 20 / 100);

        //body
        graphics.setColor(Color.PINK);
        graphics.fillOval(x, y, width, height);

        //feet
        graphics.setColor(Color.red);
        graphics.fillOval(x + (width * 12 / 100), y + (height * 85 / 100), width * 35 / 100, height * 20 / 100);

        //left eye
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x + (width * 29 / 100), y + (height * 26 / 100), width * 13 / 100, height * 31 / 100);
        graphics.setColor(Color.CYAN);
        graphics.fillOval(x + (width * 31 / 100), y + (height * 32 / 100), width * 9 / 100, height * 23 / 100);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x + (width * 30 / 100), y + (height * 30 / 100), width * 11 / 100, height * 20 / 100);
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + (width * 31 / 100), y + (height * 27 / 100), width * 9 / 100, height * 17 / 100);

        //right eye
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x + (width * 58 / 100), y + (height * 26 / 100), width * 13 / 100, height * 31 / 100);
        graphics.setColor(Color.CYAN);
        graphics.fillOval(x + (width * 60 / 100), y + (height * 32 / 100), width * 9 / 100, height * 23 / 100);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x + (width * 59 / 100), y + (height * 30 / 100), width * 11 / 100, height * 20 / 100);
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + (width * 60 / 100), y + (height * 27 / 100), width * 9 / 100, height * 17 / 100);

        // left cheek
        graphics.setColor(new Color(255, 120, 120, 255));
        graphics.fillOval(x + (width * 15 / 100), y + (height * 52 / 100), width * 13 / 100, height * 8 / 100);

        // right cheek
        graphics.setColor(new Color(255, 120, 120, 255));
        graphics.fillOval(x + (width * 71 / 100), y + (height * 52 / 100), width * 13 / 100, height * 8 / 100);

        // mouth
        graphics.setColor(new Color(110, 4, 4, 255));
        graphics.fillOval(x + (width * 40 / 100), y + (height * 54 / 100), width * 20 / 100, height * 13 / 100);
        graphics.setColor(new Color(110, 4, 4, 255));
        graphics.fillOval(x + (width * 42 / 100), y + (height * 56 / 100), width * 16 / 100, height * 12 / 100);
        graphics.setColor(new Color(110, 0, 0, 255));
        graphics.fillOval(x + (width * 42 / 100), y + (height * 55 / 100), width * 13 / 100, height * 12 / 100);

        // tongue
        graphics.setColor(new Color(241, 120, 109, 255));
        graphics.fillOval(x + (width * 45), y + (height * 20 / 100), width * 15 / 100, height * 10 / 100);
        graphics.setColor(new Color(241, 120, 109, 255));
        graphics.fillOval(x + (width * 42 / 100), y + (height * 57 / 100), width * 16 / 100, height * 10 / 100);
        graphics.setColor(new Color(241, 120, 109, 255));
        graphics.fillOval(x + (width * 43 / 100), y + (height * 58 / 100), width * 13 / 100, height * 10 / 100);
        graphics.setColor(new Color(241, 120, 109, 255));
        graphics.fillOval(x + (width * 44 / 100), y + (height * 58 / 100), width * 13 / 100, height * 10 / 100);

        //arm
        graphics.setColor(Color.PINK);
        graphics.fillOval(x + (width * 83 / 100), y + (height * 50 / 100), width * 32 / 100, height * 25 / 100);
        graphics.setColor(Color.PINK);
        graphics.fillOval(x - (width * 15 / 100), y + (height * 50 / 100), width * 32 / 100, height * 25 / 100);
        
       
    }

    private int x;
    private int y;
    private int width;
    private int height;

}
