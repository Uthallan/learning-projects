// Draws boxed ovals using a while loop.
import java.awt.*;

public class DrawLoop 
{
    public static void main(String[] args) 
    {
        DrawingPanel panel = new DrawingPanel(500, 250);
        panel.setBackground(Color.CYAN);
        Graphics g = panel.getGraphics();

        int sizeX = 50;  // size of boxes
        int sizeY = 25;
       // int i = 0;       // start at i = 0
        for (int i = 0; i <= 10; i++) {    // repeat for i = 0,1,2...7
            int cornerX = i*50;  // calculate upper left corner
            int cornerY = i*25;
            g.setColor(Color.WHITE);
            g.fillOval(cornerX + 5, cornerY + 5, sizeX-10, sizeY-10);
            g.setColor(Color.BLACK);
            g.drawRect(cornerX, cornerY, sizeX, sizeY);
            g.drawString("" + (i + 1), cornerX+20, cornerY+17);
          //  i++; // increment i for next iteration
        }
    }
}
