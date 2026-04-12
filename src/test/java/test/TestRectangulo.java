 package test;

import modelo.Rectangulo;

public class TestRectangulo {

    public static void main(String[] args) {
        
        int pruebas = 0;
        int exitosas = 0;

        System.out.println("=============================");
        System.out.println("   TEST UNITARIOS - Rectángulo");
        System.out.println("=============================\n");
//
       
        pruebas++;
        Rectangulo r = new Rectangulo(0, 0, 5, 4);
        if (r != null) {
            System.out.println("✔ TEST 1 PASÓ: Rectángulo creado correctamente");
            exitosas++;
        } else {
            System.out.println("✘ TEST 1 FALLÓ: No se creó el rectángulo");
        }

        
        pruebas++;
        double area = r.calcularArea();
        if (area == 20.0) {
            System.out.println("✔ TEST 2 PASÓ: Área correcta = " + area);
            exitosas++;
        } else {
            System.out.println("✘ TEST 2 FALLÓ: Área incorrecta = " + area);
        }

        
        pruebas++;
        boolean dentro = r.contienePunto(3, 2);
        if (dentro) {
            System.out.println("✔ TEST 3 PASÓ: Punto (3,2) está dentro");
            exitosas++;
        } else {
            System.out.println("✘ TEST 3 FALLÓ: Punto (3,2) debería estar dentro");
        }

       
        pruebas++;
        boolean fuera = r.contienePunto(10, 10);
        if (!fuera) {
            System.out.println("✔ TEST 4 PASÓ: Punto (10,10) está fuera");
            exitosas++;
        } else {
            System.out.println("✘ TEST 4 FALLÓ: Punto (10,10) debería estar fuera");
        }

        
        pruebas++;
        r.mover(3, 0);
        if (r.getX1() == 3 && r.getX2() == 8) {
            System.out.println("✔ TEST 5 PASÓ: Movimiento horizontal correcto");
            exitosas++;
        } else {
            System.out.println("✘ TEST 5 FALLÓ: x1=" + r.getX1() + " x2=" + r.getX2());
        }

        
        pruebas++;
        r.mover(0, 2);
        if (r.getY1() == 2 && r.getY2() == 6) {
            System.out.println("✔ TEST 6 PASÓ: Movimiento vertical correcto");
            exitosas++;
        } else {
            System.out.println("✘ TEST 6 FALLÓ: y1=" + r.getY1() + " y2=" + r.getY2());
        }

        
        pruebas++;
        r.escalar(20, 15);
        if (r.getX2() == 20 && r.getY2() == 15) {
            System.out.println("✔ TEST 7 PASÓ: Escalado correcto");
            exitosas++;
        } else {
            System.out.println("✘ TEST 7 FALLÓ: x2=" + r.getX2() + " y2=" + r.getY2());
        }

       
        pruebas++;
        modelo.RectanguloColoreado rc = new modelo.RectanguloColoreado(0, 0, 10, 5, "Azul");
        if (rc.calcularArea() == 50.0) {
            System.out.println("✔ TEST 8 PASÓ: Herencia funciona, área = " + rc.calcularArea());
            exitosas++;
        } else {
            System.out.println("✘ TEST 8 FALLÓ: área = " + rc.calcularArea());
        }

        
        System.out.println("\n=============================");
        System.out.println("RESULTADO: " + exitosas + "/" + pruebas + " pruebas exitosas");
        System.out.println("=============================");
    }
}