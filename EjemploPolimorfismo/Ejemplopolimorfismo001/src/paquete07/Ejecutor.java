package paquete07;

import java.util.ArrayList;

public class Ejecutor {
    public static void main(String[] args) {
        // inicio de la solución
        
        ArrayList<Figura> figuras = new ArrayList<>();
        
        // Crear objetos de tipo Triangulo
        Triangulo t1 = new Triangulo(4, 3);
        Triangulo t2 = new Triangulo(5, 7);
        Triangulo t3 = new Triangulo(6, 8);
        Triangulo t4 = new Triangulo(7, 9);
        Triangulo t5 = new Triangulo(8, 6);
        
        // Crear objetos de tipo Cuadrado
        Cuadrado c1 = new Cuadrado(8);
        Cuadrado c2 = new Cuadrado(9);
        Cuadrado c3 = new Cuadrado(3);
        Cuadrado c4 = new Cuadrado(3);
        
        // Crear objetos de tipo Rombo
        Rombo r1 = new Rombo(2, 4);
        Rombo r2 = new Rombo(2, 2);
        Rombo r3 = new Rombo(1, 9);
        
        // Añadir los objetos al ArrayList figuras
        figuras.add(t1);
        figuras.add(t2);
        figuras.add(t3);
        figuras.add(t4);
        figuras.add(t5);
        figuras.add(c1);
        figuras.add(c2);
        figuras.add(c3);
        figuras.add(c4);
        figuras.add(r1);
        figuras.add(r2);
        figuras.add(r3);
        
        // proceso para comprobar el polimorfismo
        for (Figura figura : figuras) {
            figura.calcular_area();
            System.out.printf("Datos de Figura\n%s\n", figura);
        }
    }
}
