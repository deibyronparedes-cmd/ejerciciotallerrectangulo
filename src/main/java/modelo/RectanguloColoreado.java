package modelo;

public class RectanguloColoreado extends Rectangulo {
//
    private final String color;

    public RectanguloColoreado(double x1, double y1, double x2, double y2, String color) {
        super(x1, y1, x2, y2);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " Color: " + color;
    }
}