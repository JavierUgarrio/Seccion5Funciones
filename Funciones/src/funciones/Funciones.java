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
        var sumarRr = sumarR(7,8);
        System.out.println("la suma es "+  sumarRr);
        System.out.println("la suma es "+ sumarR(21,2));
        System.out.println(saludarR("Joselito"));
        cuentaRegresiva(10);
        System.out.println(sumarEnteros("Jose javier ",1,6,7));
        
        //llamar Metodo
        Funciones s = new Funciones();
        s.myMetodo("Hola Mundo");
        
    }
    /*
        Definir una funcion
        void, significa que va retonar
        los parametros son los datos que se envian a la funcion
        return, retona un valor...ojo en la funcion si se pone el return hay que eliminar void y poner el tipo de dato que se va a retonar
    */
    static void saludar(String nombre){
        System.out.println("Hola " + nombre + " desde la funcion");
    }
    
    static String saludarR(String nombre){
        return "Hola " + nombre + " desde la funcion con return";
    }
    
    static void sumar(int num1, int num2){
        int suma = num1 + num2;
        System.out.println("la suma total es: " + suma);
    }
    
    static int sumarR(int num1, int num2){
        return num1+num2;
    }
    
    //sobrecarga de funciones
    static double sumar(double num1, double num2){
        return num1+num2; 
    }
    //funciones recursivas, son funciones que se ejecutan por si mismas    
    static void cuentaRegresiva(int num1){
        num1--;
        if(num1>0){
            System.out.println(num1);
            cuentaRegresiva(num1);
        }else{
            System.out.println("llego hasta 0");
        }
    }
    //envio de argumentos indefinidos, OJO si añadimos otros tipos de datos, hay que añadirlos al inicio, ya que los parametros indefinidos van al final 
    static int sumarEnteros(String nombre, int ... num1){
        int suma = 0;
        for (int numeros: num1){
            suma += numeros;
        }
        return suma;
    }
    
    // Definir un metodo
    public void myMetodo(String saludo){
        System.out.println(saludo);
    }
    
    
}
