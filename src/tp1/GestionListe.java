/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp1;

/**
 *
 * @author Admin
 */
public class GestionListe {
    int element = 0;
    Maillon current;
    
    public void add(Maillon maillon) {
        if (null == current) {
            current = maillon;
            element++;
        } else {
            maillon.setPrevious(current);
            current.setNext(maillon);
            current = maillon;
            element++;
        }
    }
    
    public float sum() {
        float sum = 0;
        Maillon monMaillon = current;
        while(monMaillon.hasPrevious()) {
            sum += (float)monMaillon.getValue();
            monMaillon = monMaillon.getPrevious();
        }
        sum += (float)monMaillon.getValue();//don't forget the last one

        return sum;
    }
    
}
