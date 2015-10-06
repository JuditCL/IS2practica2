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
        String[] array1 = {"Ana", "Juan", "Pedro", "Ana", "Juan", "Pedro"};
        Histogram <String> result = CalculaHisto.computeHisto(array1);
        /*fore tab*/
        for (String key : result.keySet()) {
            System.out.println(key + ":" + result.get(key));
        }        
    }
}
