/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_6_automovil;

/**
 *
 * @author galle
 */
public class auto {
    //atributos de la clase
    private String dueño;
    private String marca;
    private String modelo;
    private String placas;
    private int año;
    
    //constructor default
    public auto(){
        dueño = "--";
        marca = "--";
        modelo= "--";
        placas= "--";
        año = 0;
    }
    
    //constructor argumentos
    public auto (String nDueño, String nMarca, String nModelo, String nPlacas, int nAño){
        dueño = nDueño;
        marca = nMarca;
        modelo= nModelo;
        placas= nPlacas;
        año = nAño;
    }
    //get y set dueño
    public String getDueño(){
         return dueño;
}
    public void setDueño (String dueñoAuto){
        dueño = dueñoAuto;
    }
    
    //get y set marca
    public String getMarca(){
         return marca;
}
    public void setMarca(String marcaAuto){
        marca = marcaAuto;
    }
    
    //get y set modelo
    public String getModelo(){
         return modelo;
}
    public void setModelo (String modeloAuto){
        modelo = modeloAuto;
    }
    
    //get y set placas
    public String getPlacas(){
         return placas;
}
    public void setPlacas (String placasAuto){
        placas = placasAuto;
    }
    // get y set año
    public int getAño(){
     return año;    
 }
 public void setAño(int añoAuto){
     año =añoAuto;
 }
 
 
 // print
 public void imprimirDatos(){
     System.out.println("Propietario: "+dueño);
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Placas: "+placas);
     System.out.println("Año: "+año);
     //System.out.println("Adeudo: "+calcularAdeudo());
 }
 //adeudo propio
 public void calcularAdeudo(){
     if (año <= 2000){
         System.out.println("Debe $1500");
     }
      if (año >= 2001 && año <= 2006){
          System.out.println("Debe $2000");
     }
      if (año >= 2006 && año <= 2010){
          System.out.println("Debe $2500");
     }
      if (año >= 2011 && año <= 2015){
          System.out.println("Debe $3000");
     }
      if (año >= 2016 && año <= 2023){
          System.out.println("Debe $4000");
     }
 }
 /* adeudo en clase, [preferible si todo trata sobre lo mismo ya que puede causar problema]
 public int calcularAde (){
   int adeudo = 0
 if (año<=2000){
    adeudo 1500;
 }else if ((año >= 2001) && (año<= 2005)){
    adeudo = 2000;
 
 return adeudo;
 */
 

}
