package modelo;

public class Rectangulo {

    private double x1, y1;
    private double x2, y2;

    
    public Rectangulo(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    
    public double calcularArea() {
        return Math.abs((x2 - x1) * (y2 - y1));
    }

  
    public void escalar(double nuevoX2, double nuevoY2) {
        this.x2 = nuevoX2;
        this.y2 = nuevoY2;
    }

    
    public boolean contienePunto(double x, double y) {
        return x >= Math.min(x1, x2) && x <= Math.max(x1, x2)
            && y >= Math.min(y1, y2) && y <= Math.max(y1, y2);
    }

   
    public void mover(double dx, double dy) {

        if (dx != 0 && dy != 0) {
            System.out.println("Solo se puede mover en un eje a la vez");
            return;
        }

        x1 += dx;
        x2 += dx;
        y1 += dy;
        y2 += dy;
    }

    // 🧾 Texto
    @Override
    public String toString() {
        return "Rectangulo: (" + x1 + "," + y1 + ") a (" + x2 + "," + y2 + ")"
                + " | Area: " + calcularArea();
    }

   
    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }
}