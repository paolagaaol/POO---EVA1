/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_3_constructores;

/**
 *
 * @author galle
 */
public class EVA_1_3_CONSTRUCTORES {

    public static void main(String[] args) {
        //Clase CuentaBancaria
        //String numero de cuenta
        //Doble saldo
        //String cliente
      CuentaBancaria cuenta1 = new CuentaBancaria("1", 1000, "Paola");
        cuenta1.setNomCliente("Juan Perez");
        cuenta1.setNumCuenta("02558");
        cuenta1.setSaldo(1000000);
        
         System.out.println("DATOS DEL CLIENTE");
         String nombre = cuenta1.getNomCliente();
         System.out.println(nombre);
         System.out.println(cuenta1.getNumCuenta());
         System.out.println(cuenta1.getSaldo());
        
     System.out.println("--------------");
        //----
        CuentaBancaria cuenta2= new CuentaBancaria("3", 200000, "Cesar Urias");
         System.out.println("DATOS DEL CLIENTE");
       
         System.out.println(cuenta2.getNomCliente());
         System.out.println(cuenta2.getNumCuenta());
         System.out.println(cuenta2.getSaldo());
         
     System.out.println("--------------");
          CuentaBancaria cuenta3= new CuentaBancaria();
         System.out.println("DATOS DEL CLIENTE");
       
         System.out.println(cuenta3.getNomCliente());
         System.out.println(cuenta3.getNumCuenta());
         System.out.println(cuenta3.getSaldo());
    }
}

