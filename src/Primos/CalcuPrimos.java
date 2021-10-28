/*
* Tenemos que usar TreeMap ya que su complejidad es logaritmica y lo hace muchisimo mas eficiente.
* */

package Primos;

import java.util.*;

public class CalcuPrimos {

    protected Map<Integer,Boolean> numPrimos = new TreeMap<Integer,Boolean>();

    protected boolean esPrimo(int n){

        //--Si el n ya fue calculado antes
        if(numPrimos.containsKey(n)){
            return numPrimos.get(n);
        }

        //--Si el n nunca fue calculado
        int cont = 0;

        for(int i = 2; i < n-1; i++){
            if(n % i == 0){
                cont++;
            }
        }

        if(cont == 0){
            numPrimos.put(n, true);
            return true;
        }else{
            return false;
        }

    }

    //--Mostramos los primos guardados en el Map
    protected void primosConocidos(){
        for(Map.Entry<Integer,Boolean> n : numPrimos.entrySet()){
            int key = n.getKey();

            System.out.println("Numero Primo: " + key);
        }
    }
}
