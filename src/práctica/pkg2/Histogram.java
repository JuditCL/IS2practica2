/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg2;

import java.util.HashMap;


public class Histogram {
   private final int[] elvector;

    public Histogram(int[] elVector) {
        this.elvector = elVector;
    }

    public int[] getElvector() {
        return elvector;
    }
   
    public HashMap<Integer,Integer> getHisto(){
        HashMap<Integer,Integer> contador = new HashMap<Integer,Integer>();
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
