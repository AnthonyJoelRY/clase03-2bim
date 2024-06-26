/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
        */
        
        // inicio de la solución
        
        ArrayList<Figura> figuras = new ArrayList<>();
        Triangulo c1 = new Triangulo(4,3);
        Triangulo c2 = new Triangulo(5,7);
        Triangulo c3 = new Triangulo(6,8);
        Triangulo c4 = new Triangulo(7,9);
        Triangulo c5 = new Triangulo(8,6);
        
        Cuadrado c01 = new Cuadrado(8);
        Cuadrado c02 = new Cuadrado(9);
        Cuadrado c03 = new Cuadrado(3);
        Cuadrado c04 = new Cuadrado(3);
        
        Rombo c001 = new Rombo(2,4);
        Rombo c002 = new Rombo(2,2);
        Rombo c003 = new Rombo(1,9);
        
        figuras.add(c1,c2,c4,c5,c01,c02,c03,c04,c001,c002,c003);
        
        
        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcular_area();
            
            System.out.printf("Datos de Figura\n"
                        + "%s\n",                        
                  figuras.get(i));
        }
    }
}
