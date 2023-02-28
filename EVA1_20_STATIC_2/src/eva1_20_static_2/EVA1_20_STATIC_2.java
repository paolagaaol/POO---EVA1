/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_static_2;

/**
 *
 * @author galle
 */
public class EVA1_20_STATIC_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
      /*  final int x;
        x = 100;
        x = 200;
      */
      FormulasGeometria formulas = new FormulasGeometria ();
      //formulas. no existe ningun metodo dentro del objeto
        System.out.println("Mi PI: "+FormulasGeometria.PI);
        System.out.println("Area Triangulo: "+FormulasGeometria.areaTriangulo(5.0, 5.0));
        System.out.println("Volumen esfera: "+FormulasGeometria.volumenE(10)); 
    }
    
}
