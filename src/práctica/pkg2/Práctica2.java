/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg2;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class Práctica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {1,4,7,1,1,8,1,4,9,9};
        Histogram result = new Histogram(array);
        String[] array1 = {"Ana", "Juan", "Pedro", "Ana", "Juan", "Pedro"};
        HashMap <Integer, Integer> contador = result.getHisto();
        /*fore tab*/
        for (Integer key : contador.keySet()) {
            System.out.println(key + ":" + contador.get(key));
        }
        
    }
}
