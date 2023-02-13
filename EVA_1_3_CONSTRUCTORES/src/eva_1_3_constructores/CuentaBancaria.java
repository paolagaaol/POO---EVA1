/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_1_3_constructores;

/**
 *
 * @author galle
 */
public class CuentaBancaria {
    private String numCuenta;
    private double saldo;
    private String nomCliente;
    //Constructores
    //default y con argumentos
    public CuentaBancaria(){
        numCuenta= "0";
       saldo = 0;
      nomCliente="-"; 
      }
    public CuentaBancaria(String nCuenta, double OtherSaldo, String nCliente){
       numCuenta = nCuenta;
       saldo = OtherSaldo;
       nomCliente = nCliente;
    }
    // Comportamiento
    //get
    public String getNumCuenta(){
        return numCuenta;
    }
    public double getSaldo(){
        return saldo;
   }
    public String getNomCliente(){
        return nomCliente;
    }
    //SET
    public void setNumCuenta(String valor){
        valor = numCuenta;
    }
    public void setSaldo(double valor){
        valor = saldo;
    }
    public void setNomCliente(String valor){
        valor = nomCliente;
    }
}
