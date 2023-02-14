/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_4_tv;

/**
 *
 * @author galle
 */
public class TV {
    private int volumen;
    private int canal;
    private boolean power;
        //constructores
    public TV (){ //constructor default
        volumen =2;
        canal = 99;
        power = false; //apagado
    }    
    // metodos para operar
    public void cambiarEstadoPoder(){
        if (power == true){
            power = false;
            System.out.println ("Apagando pantalla");
        }    
        else { 
        power= true;
        System.out.println ("Encendiendo pantalla");
    }
}
    //volumen
    public void subirVolumen (){
        if(power==true){ //if(power)
            if(volumen<100){
             volumen++; //acumulador
             System.out.println ("Volumen: "+ volumen);
     }
    }
   }
     public void bajarVolumen (){
         if (power==true){ //if(power)
             if(volumen>0){
               volumen--; //acumulador
        System.out.println ("Volumen: "+ volumen);
    }
}
}
         //canal
       public void subirCanal (){
        if(power==true){ //if(power)
            canal = canal + 1;
            if(canal>100)
               canal=0;
             System.out.println ("canal: "+ canal);
     
    }
   }
     public void bajarCanal (){
         if (power==true){ //if(power)
              canal= canal-1; //acumulador
             if(canal<0)
                 canal = 100;
              
        System.out.println ("canal: "+ canal);
    
}
}

         
}

