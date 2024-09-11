
package funciones;

public class ClaseString {
    public static void main(String []args){
        //Metodos de String
        
        /*
        charAt() este metodo se puede acceder a cada indice de esta cadena, es decir a cada caracter de una cadena de caracteres
        */
        String nombre = "Javier";
        System.out.println(nombre.charAt(3)); //muestra la "i"
        
        /*
        length() este metodo devuelve la cantidad de caracteres de una cadena de caracteres. con este metodo se puede iterar una cadena de caracteres
        */
        String apellido = "Ugarrio";
        System.out.println("Cantidad de caracteres que tiene: " + apellido.length());
        for(int i =0; i< apellido.length();i++){
            System.out.println(apellido.charAt(i));
        }
        
        /*
        substring() extrae parte los caracteres que tu decidas
        */
        System.out.println(apellido.substring(0,3));
        
        /*
        toLowerCase() y toUpperCase() sirven para cambiar los caracteres de mayusculas a minusculas y viceversa
        */
        System.out.println(apellido.toLowerCase());
        System.out.println(apellido.toUpperCase());
        
        String apellidos = "u g a r r i o";
        System.out.println(apellidos.replace(" ", "-"));
        
        /*
        Equals() compara dos cadenas de caracteres si son iguales o no, devuelve true o false
        */
        
        System.out.println(apellido.equals(nombre));
        
        /*
            Documentacion de los metodos String
            https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html
        */
        
        /*
            Crea un objeto StringBuilder: StringBuilder es una clase que se usa para construir y manipular cadenas de texto de manera eficiente
        
            Utilidad: StringBuilder es útil cuando necesitas construir o modificar cadenas de texto en un bucle o en una serie de operaciones porque es más eficiente que usar concatenación de strings repetidamente, que puede ser más lenta y consumir más memoria.
        */
        StringBuilder nuevo = new StringBuilder();
        System.out.println(nuevo);
        nuevo.append("hola");
        nuevo.append("Mundo");
        System.out.println(nuevo.toString());
    }
}
