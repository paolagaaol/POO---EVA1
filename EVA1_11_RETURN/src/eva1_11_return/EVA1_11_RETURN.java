/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_return;

/**
 *
 * @author galle
 */
public class EVA1_11_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resu;
        resu = square (10); //llamada a funcion o invocacion
        System.out.println("resultado: "+ resu);
    }
   
    public static int square (int num){
      return num * num;        
    }

}
