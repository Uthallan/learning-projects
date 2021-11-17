import java.awt.*;

public class TileStart {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(310,190);
        Graphics2D g = panel.getGraphics();        

        diagonalTile(g, 10,10, 50);     // small
        diagonalTile(g, 70,10, 50);     // small
        diagonalTile(g, 10,70, 110);    // medium
        diagonalTile(g, 130,10, 170);   // large
    }

    public static void diagonalTile(Graphics2D g, int x, int y, int size) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);

        for (int i = 0; i <= 4; i++) {
            int dx = size * i/5;
            g.drawLine(x, y+dx, x+size-dx, y+size);
        }
    }
}