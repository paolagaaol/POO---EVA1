/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_static;

/**
 *
 * @author galle
 */
public class EVA1_19_STATIC {

    /**
     STATIC: algo que podemos usar sin crear instancias de una clase 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PI:" + Math.PI);
        System.out.println("Num Aleatorio: "+ Math.random());
        Utilerias utileria = new Utilerias ();
        utileria.Saludo();
        Utilerias.otroSaludo();
        // Saludo2(); Si no es estatico y no se ha creado un objeto, el metodo no existe.
    }
    public void Saludo2(){
        System.out.println("Hola");
    }
}

class Utilerias{
    // Este metodo existe hasta que se crea un objeto de la clase. Solo se usa a traves de un objeto
    public void Saludo(){
        System.out.println("Hola!!");
    }
    //----------------------------------------------------------------------------------------------
    // Este metodo existe en el momento en que el programa incia su ejecucion.
    // No necesita que se cree un objeto de la clase para poderlo utilizar
    // Se usa a través de la clase.
    public static void otroSaludo (){
        System.out.println("Otro saludo (static)");
    }
            
}