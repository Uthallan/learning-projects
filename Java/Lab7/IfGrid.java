// Draws a 10 by 10 grid of squares with an if test controlling the color.
// Used for experiments with conditional expressions.
import java.awt.*;

public class IfGrid {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(400, 480);
        panel.setBackground(Color.blue);
        Graphics g = panel.getGraphics();

        int sizeX = 40;
        int sizeY = 40;
       // int x = 0;
        for (int x = 0; x < 10; x++) {  // repeat for 10 columns x = 0,1,2 ...9
          //  int y = 0;
            for (int y = 0; y < 12; y++) {  // repeat for 10 positions in each column y = 0,1,2...9
                int cornerX = x*sizeX;
                int cornerY = y*sizeY;

                if ((x % 2) == 0 && (y % 2) == 0 || (x % 2) != 0 && (y % 2) != 0)
                    g.setColor(Color.green);
                else 
                    g.setColor(Color.yellow);

                g.fillRect(cornerX, cornerY, sizeX-1, sizeY-1);
                g.setColor(Color.black);
                g.drawString((" "+ (x+1)) + "*" + (" " + (y+1)) , cornerX, cornerY+15);  // text is positioned at its baseline
                g.drawString(" "+((y+1) * (x+1)), cornerX+10, cornerY+33);  // offsets from the corner do centering
              //  y++;  // increment for next iteration
            }
          //  x++;  // increment for next iteration
        }
    }
}
