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
public class CLASE_C {
     public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba (){
        CLASE_A objA = new CLASE_A();
        //objA.defaultA;
        //objA.publicA;
        
         ClaseD objD = new ClaseD ();
        //objD.defaultD;
        //objD.publicD;
                
         CLASE_E objE = new CLASE_E ();
         //objE.publicE;
         
       ClaseB objB = new ClaseB ();
       //objB.defaultB;
       //objB.publicB;
    }
}

class ClaseD{
     public int publicD;
    int defaultD;
    private int privateD;
}
