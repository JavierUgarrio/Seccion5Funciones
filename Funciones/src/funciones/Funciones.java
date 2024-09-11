/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

/**
 *
 * @author User
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //llamar Funcion
        saludar("Javier");
        sumar(1,2);
        
        //llamar Metodo
        Funciones s = new Funciones();
        s.myMetodo("Hola Mundo");
        
    }
    /*
        Definir una funcion
        void, significa que va retonar
        los parametros son los datos que se envian a la funcion
    */
    static void saludar(String nombre){
        System.out.println("Hola " + nombre + " desde la funcion");
    }
    
    static void sumar(int num1, int num2){
        int suma = num1 + num2;
        System.out.println("la suma total es: " + suma);
    }
    
    // Definir un metodo
    public void myMetodo(String saludo){
        System.out.println(saludo);
    }
    
    
}
