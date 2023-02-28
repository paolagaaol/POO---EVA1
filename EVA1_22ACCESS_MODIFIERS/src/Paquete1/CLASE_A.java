/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

import Paquete2.CLASE_E;

/**
 *
 * @author galle
 */
public class CLASE_A {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void pruebaA(){
        ClaseB objB = new ClaseB();
        //objB.publicB; atributos visibles
        //objB.defaultB;
        
       CLASE_C objC = new CLASE_C ();
       //objC.defaultC; atributos visibles
       //objC.publicC;
            
       //CLASE D ES DEFAULT EN OTRO ARCHIVO PERO MISMO PAQUETE
       ClaseD objD = new ClaseD ();
       //objD.defaultD; atributos visibles por ser mismo paquete
       //objD.publicD;
      
       //CLASE E ESTA EN OTRO PAQUETE Y ARCHIVO.
       //HAY QUE AGREGAR LA CLAUSULA IMPORT
       CLASE_E objE = new CLASE_E ();
       // objE.publicE; solo se ve el atributo publico
       
       /* ClaseF es default y es invisible para las clases de este paquete
       ClaseF objF = new ClaseF ();
       */
} 
}

class ClaseB {
     public int publicB;
    int defaultB;
    private int privateB;
}