/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_5_circulo;

/**
 *
 * @author galle
 */
public class CIRCULO {
    //atributos de la clase
    private double area;
    private double perimetro;
    private double radio;
    private double diametro;
    
     public CIRCULO(){ //constructor default
     area=0;
     perimetro=0;
     radio=0;
     }
     
    //metodos get y set
    //area
public double getArea(double valor){
    return area;
}    
public void setArea (double valor){
    area = valor;
}

// radio 
public double getRadio(){
    return radio;
}    
public void setRadio (double valor){
    radio = valor;
}

// perimetro 
public double getPerimetro(){
    return diametro;
}    
public void setPerimetro (double valor){
    diametro = valor;
}
// metodo area
public void obtenerArea(){
    area = Math.PI * Math.pow(radio,2);
}
// metodo perimetro
public void obtenerPerimetro (){
    perimetro = 2*Math.PI*radio;
}
 public void imprimirDatos(){
     System.out.println("---Datos almacenados---");
     System.out.println("radio designado: "+radio);
     System.out.println("area: "+area);
     System.out.println("perimetro: "+perimetro);
 }
 

}

