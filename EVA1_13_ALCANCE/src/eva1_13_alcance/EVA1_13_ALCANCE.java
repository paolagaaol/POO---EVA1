/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_alcance;

/**
 *
 * @author galle
 */
public class EVA1_13_ALCANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 101;
        for (int i = 0; i < 10; i++) { // inicio del bloque
            System.out.println("i = "+i);
            int j = 100;
            System.out.println("j = "+j);
            System.out.println("a: "+ a);
            {
            int z = 100;
              System.out.println("z: "+ z);
            }
             // System.out.println("z: "+ z); [no es visible por estar fuera de las llaves
        }
    }//termina bloque
     public static void algo (){
       //  System.out.println("x = "+x); //no es visible en otro metodo
     }
}
