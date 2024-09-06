/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratoriosesion3;

/**
 *
 * @author PC
 */
public class CalculadoraOperacion {
    private double numero1;
    private double numero2;
    private String operacion;
    
    public void setNumero1(double numero1)
    {
        this.numero1 = numero1;
    }
    
    public void setOperacion(String operacion)
    {
        this.operacion = operacion;
    }
    
    public double calcular(double numero2)
    {
        this.numero2 = numero2;
        switch(operacion)
        {
            case "SUMA":
                return numero1 + numero2;
            
            case "RESTA":
                return numero1 - numero2;
            
            case "MULTIPLICACION":
                return numero1 * numero2;
            
            case "DIVISION":
                return numero1 / numero2;
        }
        return 1;
    }
    public void limpiar()
    {
        numero1 = 0;
        numero2 = 0;
        operacion = null;
    }
}
