/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg2;

public class CalculaHisto {
    public static <T>Histogram<T> computeHisto(T[] vector){
        Histogram <T> histo = new Histogram<>();
        for (T key : vector) {
            histo.increment(key);
        }
        return histo;
    }
}
