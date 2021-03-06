import java.awt.Color;
import java.awt.Graphics;

public class Coloring {

	public static void main(String[] args) {


        DrawingPanel panel = new DrawingPanel(800, 800);
        panel.setBackground(Color.WHITE);
        Graphics g = panel.getGraphics();

        
        for (int x = 0; x <= 100; x++) {
        	for (int y = 0; y <= 7; y++) {
        		if ((y % 2) == 0) {
            int cornerX = x*20;  // calculate upper left corner
            int cornerY = y*100;
            g.setColor(Color.BLACK);
            g.drawOval(cornerX-100, cornerY, 100, 100);
            g.setColor(Color.WHITE);
            g.fillOval(cornerX-100, cornerY, 100, 100);
        		}
        		
        		else {
            
            int cornerX = 1000-(x*20);  // calculate upper left corner
            int cornerY = y*100;
            g.setColor(Color.BLACK);
            g.drawOval(cornerX-100, cornerY, 100, 100);
            g.setColor(Color.WHITE);
            g.fillOval(cornerX-100, cornerY, 100, 100);
            }
        	}
                     }
        g.setColor(Color.BLACK);
        g.drawLine(0, 0, 0, 800);
        g.drawLine(0, 0, 800, 0);
        g.drawLine(799, 0, 799, 799);
        g.drawLine(799, 799, 0, 799);
    
	}

}
