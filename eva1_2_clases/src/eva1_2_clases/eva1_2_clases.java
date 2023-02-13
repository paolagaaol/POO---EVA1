/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_clases;

/**
 *
 * @author galle
 */
public class eva1_2_clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // clase es la receta
        // objeto es el platillo 
        // 1. Declarar el identificador para el objeto
        // 2. Asignar memoria con new
        // 3. Invocar su constructor
        // Persona () -> constructor
        // constructor --> método
        
        Persona perso1 = new Persona ();
        /* ESTA SECCION ES PORQUE INICIAMOS CON LOS
        /ATRIBUTOS CON MODIFICADOR DEFAULT
        
        perso1.nombre = "Paola";
        perso1.apellido = "Gallegos";
        perso1.edad = 18;
        perso1.estadoCivil = false;
        
        System.out.println (perso1.nombre);
        System.out.println (perso1.apellido);
        System.out.println (perso1.edad);
        System.out.println (perso1.estadoCivil);
        */
         
        perso1.setNombre("Paola ");
        perso1.setApellido("Gallegos");
        perso1.setEdad(18);
        perso1.setEstadoCivil(true);
        
        /*System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellido());
        System.out.println(perso1.getEdad());
        System.out.println(perso1.getEstadoCivil());
        */
        perso1.imprimirDatos();
        
        System.out.println ("---------");
        
        //Persona 2
         Persona perso2 = new Persona ();
        perso2.setNombre("Cesar");
        perso2.setApellido("Urias");
        perso2.setEdad(19);
        perso2.setEstadoCivil(true);
        
                perso2.imprimirDatos();

    }
    
}
