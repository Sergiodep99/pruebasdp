import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Sergio Delicado Piqueras
 * @version 1.0
 * Nombre: miniCalculadoraEjemplo
 * Descripcion General:
 * Tiene dos metodos, uno que recibe un numero de tipo double y devuelve su valor absoluto y otro para sacar la raiz cuadrada
 */
public class miniCalculadora {
    /**
     * constructor vacio de la clase para poder usar los metodos
     */
    public miniCalculadora(){
        
    }
    /**
     * Metodo: getvalorabsoluto
     * Metodo que a traves de un Double devuelve su valor absoluto
     * @param x Double
     * @return valor absoluto de x
     */
    public double getvalorabsoluto(double x){
        return abs(x);
    }
    /**
     * Metodo: getraizcuadrada
     * Metodo que a traves de un Double devuelve su raiz cuadrada
     * @param x Double
     * @return raiz cuadrada de x
     */
    public double getraizcuadrada(double x){
        return sqrt(x);
    }
    
    public String hola(){
        return "Hola Juapoh";
    }
    
    public static void main(String[] args){
        // Llamamos a los metodos con un valor
        double x= 7;
        
        System.out.println(new miniCalculadora().getvalorabsoluto(x));
        System.out.println(new miniCalculadora().getraizcuadrada(x));
    }
}
