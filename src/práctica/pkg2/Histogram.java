/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg2;

import java.util.HashMap;


public class Histogram <T>{
   private final T[] elvector;

    public Histogram(T[] elVector) {
        this.elvector = elVector;
    }

    public T[] getElvector() {
        return elvector;
    }
   
    public HashMap<T,Integer> getHisto(){
        HashMap<T,Integer> contador = new HashMap<T,Integer>();
        for(int i = 0; i < elvector.length;i++){
            if(contador.containsKey(elvector[i])){
                contador.put(elvector[i], contador.get(elvector[i])+1);
            }else{
                contador.put(elvector[i], 1);
            }
        }
        return contador;
    }
}
