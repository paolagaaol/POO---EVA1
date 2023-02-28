/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_static_3;

/**
 *
 * @author galle
 */
public class EVA1_21_STATIC_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here.
        System.out.println(Prueba.valor);
        Prueba.valor++;
        System.out.println(Prueba.valor); // si se modifico
        System.out.println("Ahora con objetos");
        pruebaObjetos obj = new pruebaObjetos();
        System.out.println(obj.valor);
        obj.valor++;
        System.out.println(obj.valor);
        pruebaObjetos obj2 = new pruebaObjetos();
        System.out.println(obj2.valor);
    }
    
}

class Prueba{
    public static int valor = 100;
}

class pruebaObjetos{
        public int valor = 100;
}