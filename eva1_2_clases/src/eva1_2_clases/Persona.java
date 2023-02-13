/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_2_clases;

/**
 *
 * @author galle
 */
public class Persona {
    //ATRIBUTOS DE LA CLASE
   private String nombre;
   private String apellido;
   private int edad;
   private boolean estadoCivil;
   
   //METODO: COMPORTAMIENTO
   // lectura y escritura de atributos;
   // Mëtodos get --> leer. Metodo set--> escribir
   // modificador valor de retorno nombres (argumentos) (implementación)
   public String getNombre(){
       return nombre;
   }
 public void setNombre(String valor){
     nombre = valor;
 }   
 public String getApellido(){
   return apellido;
 }
 public void setApellido(String valor){
     apellido =valor;
 }        
 public int getEdad(){
     return edad;    
 }
 public void setEdad(int valor){
     edad =valor;
 }
 public boolean getEstadoCivil(){
     return estadoCivil;
 }
 public void setEstadoCivil (boolean valor){
     estadoCivil= valor;
 }
 public void imprimirDatos(){
     System.out.println("Datos almacenados");
     System.out.println("Nombre completo: " + nombre + " " + apellido);
     System.out.println("Edad: "+ edad);
     if (estadoCivil = true)
          System.out.println("Estado Civil = Casado");
     else
          System.out.println("Estado Civil = Soltero");
      
 }

  
 }
