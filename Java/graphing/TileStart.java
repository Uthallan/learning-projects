import java.awt.*;

public class TileStart {

    public static void main(String[] args) {
        int RESOLUTION = 500;
        int size = RESOLUTION/10;
        int x = 0;
        int y = 0;
        DrawingPanel panel = new DrawingPanel(RESOLUTION,RESOLUTION);
        Graphics2D g = panel.getGraphics();


        for (int i = 0; i <= 10; i++) {
            int dx = RESOLUTION * i/10;
            
            for (int ii = 0; ii <= 10; ii++) {
                int dy = RESOLUTION * ii/10;
                if ((ii % 2) == 0) {targetTile(g, x+dx, y+dy, size);}
                else {diagonalTile(g, x+dx, y+dy, size);}
            }           
        }      
    }

    public static void diagonalTile(Graphics2D g, int x, int y, int size) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);

        for (int i = 0; i <= 4; i++) {
            int dx = size * i/5;
            g.drawLine(x, y+dx, x+size-dx, y+size);
        }
    }

    public static void targetTile(Graphics2D g, int x, int y, int size) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);

        for (int i = 0; i <= 4; i++) {
            int dx = size * i/5;
            g.drawOval(x+dx/2, y+dx/2, size-dx, size-dx);
        }
    }
}