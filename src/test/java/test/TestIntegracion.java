package test;

import modelo.Rectangulo;
import modelo.RectanguloColoreado;
import controlador.ControladorRectangulo;

public class TestIntegracion {

    public static void main(String[] args) {

        int pruebas = 0;
        int exitosas = 0;

        System.out.println("=====================================");
        System.out.println("  TEST INTEGRACIÓN - Rectángulo");
        System.out.println("=====================================\n");

        // TEST 1: Controlador crea rectángulo correctamente
        pruebas++;
        ControladorRectangulo ctrl = new ControladorRectangulo();
        ctrl.crearRectangulo(0, 0, 100, 50);
        Rectangulo r = ctrl.getRectangulo();
        if (r != null) {
            System.out.println("✔ TEST 1 PASÓ: Controlador creó el rectángulo correctamente");
            exitosas++;
        } else {
            System.out.println("✘ TEST 1 FALLÓ: El rectángulo es null");
        }

        // TEST 2: Controlador muestra datos correctamente
        pruebas++;
        String datos = ctrl.mostrar();
        if (datos.contains("Area")) {
            System.out.println("✔ TEST 2 PASÓ: Mostrar datos funciona correctamente");
            exitosas++;
        } else {
            System.out.println("✘ TEST 2 FALLÓ: Mostrar no retorna datos correctos");
        }

        // TEST 3: Controlador mueve rectángulo horizontal
        pruebas++;
        ctrl.mover(50, 0);
        Rectangulo despuesMover = ctrl.getRectangulo();
        if (despuesMover.getX1() == 50 && despuesMover.getX2() == 150) {
            System.out.println("✔ TEST 3 PASÓ: Movimiento horizontal correcto");
            exitosas++;
        } else {
            System.out.println("✘ TEST 3 FALLÓ: x1=" + despuesMover.getX1() + " x2=" + despuesMover.getX2());
        }

        // TEST 4: Controlador mueve rectángulo vertical
        pruebas++;
        ctrl.mover(0, 30);
        Rectangulo despuesMoverV = ctrl.getRectangulo();
        if (despuesMoverV.getY1() == 30 && despuesMoverV.getY2() == 80) {
            System.out.println("✔ TEST 4 PASÓ: Movimiento vertical correcto");
            exitosas++;
        } else {
            System.out.println("✘ TEST 4 FALLÓ: y1=" + despuesMoverV.getY1() + " y2=" + despuesMoverV.getY2());
        }

        // TEST 5: Controlador escala rectángulo
        pruebas++;
        ctrl.escalar(200, 100);
        Rectangulo despuesEscalar = ctrl.getRectangulo();
        if (despuesEscalar.getX2() == 200 && despuesEscalar.getY2() == 100) {
            System.out.println("✔ TEST 5 PASÓ: Escalado correcto");
            exitosas++;
        } else {
            System.out.println("✘ TEST 5 FALLÓ: x2=" + despuesEscalar.getX2() + " y2=" + despuesEscalar.getY2());
        }

        // TEST 6: Controlador verifica punto dentro
        pruebas++;
        ctrl.crearRectangulo(0, 0, 200, 100);
        boolean dentro = ctrl.contiene(100, 50);
        if (dentro) {
            System.out.println("✔ TEST 6 PASÓ: Punto (100,50) está dentro correctamente");
            exitosas++;
        } else {
            System.out.println("✘ TEST 6 FALLÓ: Punto debería estar dentro");
        }

        // TEST 7: Controlador verifica punto fuera
        pruebas++;
        boolean fuera = ctrl.contiene(300, 300);
        if (!fuera) {
            System.out.println("✔ TEST 7 PASÓ: Punto (300,300) está fuera correctamente");
            exitosas++;
        } else {
            System.out.println("✘ TEST 7 FALLÓ: Punto debería estar fuera");
        }

        // TEST 8: Herencia RectanguloColoreado con Controlador
        pruebas++;
        RectanguloColoreado rc = new RectanguloColoreado(0, 0, 150, 80, "Rojo");
        if (rc instanceof Rectangulo) {
            System.out.println("✔ TEST 8 PASÓ: Herencia correcta RectanguloColoreado extiende Rectangulo");
            exitosas++;
        } else {
            System.out.println("✘ TEST 8 FALLÓ: Herencia incorrecta");
        }

        // TEST 9: RectanguloColoreado muestra color
        pruebas++;
        String datosColor = rc.toString();
        if (datosColor.contains("Rojo")) {
            System.out.println("✔ TEST 9 PASÓ: RectanguloColoreado muestra color correctamente");
            exitosas++;
        } else {
            System.out.println("✘ TEST 9 FALLÓ: No muestra el color");
        }

        // RESUMEN
        System.out.println("\n=====================================");
        System.out.println("RESULTADO: " + exitosas + "/" + pruebas + " pruebas exitosas");
        System.out.println("=====================================");
    }
}