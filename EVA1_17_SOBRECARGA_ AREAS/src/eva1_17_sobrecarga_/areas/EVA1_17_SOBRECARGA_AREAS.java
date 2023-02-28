/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_sobrecarga_.areas;

/**
 *
 * @author galle
 */
public class EVA1_17_SOBRECARGA_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("area circulo: " + area (6));
        System.out.println("area triangulo: " + area (6, 4));
        System.out.println("area trapecio: " + area (8, 4, 4));
    }
    public static double area (double r){
      return (Math.PI)* (r*r);
    }
    public static double area (double b, double h){
      return ((b*h)/2.0);
    }
    public static double area (double baseMa, double baseMe, double h){
      return h * (baseMa + baseMe)/2.0;
    }
}
