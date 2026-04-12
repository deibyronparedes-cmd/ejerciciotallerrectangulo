package vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import modelo.Rectangulo;

public class DibujoRectangulo extends JPanel {

    private Rectangulo rectangulo;

    public void setRectangulo(Rectangulo r) {
        this.rectangulo = r;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (rectangulo != null) {
            int x = (int) rectangulo.getX1();
            int y = (int) rectangulo.getY1();
            int ancho = (int) Math.abs(rectangulo.getX2() - rectangulo.getX1());
            int alto = (int) Math.abs(rectangulo.getY2() - rectangulo.getY1());

            
            g.setColor(new Color(255, 0, 0, 50));
            g.fillRect(x, y, ancho, alto);

            
            g.setColor(Color.RED);
            g.drawRect(x, y, ancho, alto);
        }
    }
}