/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_automovil;

/**
 *
 * @author galle
 */
public class EVA1_6_AUTOMOVIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     auto auto1 = new auto ();
     
     auto1.setDueño("Sam");
     auto1.setPlacas("EAS-952");
     auto1.setMarca("AUDI");
     auto1.setModelo("A4");
     auto1.setAño(2023);
     auto1.calcularAdeudo();
    
    auto1.imprimirDatos();
    
    System.out.println("---------------------------------------");
    auto auto2 = new auto("Nick", "Toyota", "RAV4", "EPN-999", 2000);
    auto2.imprimirDatos();
    auto2.calcularAdeudo();
    
     System.out.println("---------------------------------------");
    auto auto3 = new auto("Rick", "Volkswagen ", "Passat B8", "UVU-456", 2014);
    auto3.imprimirDatos();
    auto3.calcularAdeudo();
    
     System.out.println("---------------------------------------");
    auto auto4 = new auto("Fer", "Ford", "Focus", "TRT-235", 2007);
    auto4.imprimirDatos();
    auto4.calcularAdeudo();
    }
    
}
