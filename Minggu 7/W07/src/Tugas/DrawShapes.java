/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author User
 */

 import java.awt.*;
 import java.applet.*;

public class DrawShapes extends Applet {

        Font font;
        Color redColor;
        Color blueColor;
        Color backgroundColor;

        public void init() {

            //Font Arial size 18 italicsize
            font = new Font("Arial", Font.ITALIC, 18);

            redColor = Color.red;
            backgroundColor = Color.orange;

            blueColor = new Color(0, 0, 122);
            setBackground(backgroundColor);
        }

        public void stop() {
        }

        public void paint(Graphics graph) {
            graph.setFont(font);

            graph.drawString("Draw Shapes", 90, 20);

            graph.setColor(blueColor);

            graph.drawRect(150, 150, 150, 150);

            graph.fillRect(120, 120, 90, 90);

            graph.setColor(redColor);

            graph.fillArc(110, 110, 50, 50, 0, 360);

            graph.setColor(Color.CYAN);

            graph.drawRect(50, 50, 50, 50);

            graph.fillRect(50, 50, 60, 60);
        }
    }


