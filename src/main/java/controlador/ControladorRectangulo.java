package controlador;

import modelo.Rectangulo;

public class ControladorRectangulo {

    private Rectangulo r;

    public void crearRectangulo(double x1, double y1, double x2, double y2) {
        r = new Rectangulo(x1, y1, x2, y2);
    }

    public String mostrar() {
        return r.toString();
    }

    public void mover(double dx, double dy) {
        r.mover(dx, dy);
    }

    public void escalar(double x2, double y2) {
        r.escalar(x2, y2);
    }

    public boolean contiene(double x, double y) {
        return r.contienePunto(x, y);
    }

    
    public Rectangulo getRectangulo() {
        return r;
    }
}