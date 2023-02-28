/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

import Paquete1.CLASE_A;
import Paquete1.CLASE_C;

/**
 *
 * @author galle
 */
public class CLASE_E {
    public int publicE;
    int defaultE;
    private int privateE;


public void prueba (){
    CLASE_A objA = new CLASE_A();
       //}objA.publicA;
      
       
   // ClaseB objB = new ClaseB (); invisible por ser clase default en otro paquete
       
   
   CLASE_C objC = new CLASE_C();
      //objC.publicC;
}
}

class ClaseF{
    public int publicF;
    int defaultF;
    private int privateF; 
}
