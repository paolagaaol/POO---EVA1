/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_califas;

/**
 *
 * @author galle
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String cali;
          cali = grade(95); // almacena el resultado en una variable
          System.out.println("Calificacion para 95: "+ cali);
          System.out.println("Calificacion para 70: "+ grade(70)); // invoca dentro de una funcion
          grade(100); //ignora resultado, se pierde
    }
    public static String grade (int grade){
      if ((grade>= 91)&& (grade<=100)){
          return "A";
    }else if((grade>= 81) && (grade>=90)){ 
          return "B";
    }else if ((grade>= 71)&& (grade>=80)){
          return "C";
    }else{
          return "D";
    }
      /* profe likewise
      String resu = "";
         if ((grade>= 91)&& (grade>=100)){
          resu = "A";
    }else if((grade>= 81) && (grade>=90)){ 
          resu = "B";
    }else if ((grade>= 71)&& (grade>=80)){
          retsu = "C";
    }else{
          resu = "D";
    }
      */
}
}
