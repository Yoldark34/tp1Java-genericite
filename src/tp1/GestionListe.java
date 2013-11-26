/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp1;

import org.apache.log4j.Logger;

/**
 *
 * @author Admin
 */
public class GestionListe {
    private static final Logger log = Logger.getLogger(GestionListe.class.getName());

    int element = 0;
    Maillon current;
    
    public void add(Maillon maillon) {
        StringBuilder buff = new StringBuilder();
        buff.append("Add value into the list. There is ");
        buff.append(element + 1);
        buff.append(" elements.");
        log.debug(buff);
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
        StringBuilder buff = new StringBuilder();
        
        log.debug("Sum the list.");
        float sum = 0;
        Maillon monMaillon = current;
        while(monMaillon.hasPrevious()) {
            sum = addMaillonValue(sum, monMaillon);
            monMaillon = monMaillon.getPrevious();
        }
        sum = addMaillonValue(sum, monMaillon);//don't forget the last one

        buff.append("The sum is ");
        buff.append(sum);
        log.debug(buff);
        return sum;
    }
    
    private float addMaillonValue(float sum, Maillon monMaillon) {
        StringBuilder buff = new StringBuilder();
        buff.append("Value : ");
        buff.append(monMaillon.getValue());
        log.debug(buff);
        sum += (float)monMaillon.getValue();
            
        return sum;
    }
}
