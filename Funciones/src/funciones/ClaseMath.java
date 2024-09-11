
package funciones;


public class ClaseMath {
    public static void main(String[]args){
        System.out.println(Math.PI); 
        System.out.println(Math.E);
        
       //Potencias
        System.out.println(Math.pow(3, 8));
        
        //Numeros random 0-1
        System.out.println(Math.random());
        
        var numRandom = Math.random()*100;
        System.out.println(numRandom);
        
        //para convertir el numero decimal a entero
        int numRandom2 = (int)(Math.random()*100);
        System.out.println(numRandom2);
        
        //Sacar la raiz
        System.out.println((int)(Math.sqrt(9)));
        
        //sacar el maximo
        System.out.println(Math.max(5,12));
        
        //sacar el minimo
        System.out.println(Math.min(2,45));
        
        //Redondeo
        System.out.println((int) Math.round(5.882));
    }
}
