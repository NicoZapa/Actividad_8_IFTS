/*
* Lo ideal seria utilizar un Hash, para no repetir palabras en el diccionario, ya que eso
* no tendria sentido alguno.
* */

package Diccionario;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String oracion = "El es Messi";

        String[] p = oracion.split(" ");
        Map<String, String> diccionario = new LinkedHashMap<String, String>();

        diccionario.put("El", "Se antepone a un sustantivo masculino para indicar que el referente es conocido por el hablante y el oyente.");
        diccionario.put("es", "Sufijo que forma gentilicios a partir de nombres propios.");
        diccionario.put("Messi", "Jugador de futbol.");

        definicion(p, diccionario);
    }

    public static void definicion(String[] palabras, Map<String, String> definiciones){

        for(String p : palabras){
            if(definiciones.containsKey(p)){
                System.out.println(p + ": " + definiciones.get(p));
            }
        }

    }
}
