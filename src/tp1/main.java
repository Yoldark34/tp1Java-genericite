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
public class main {
    
    static final Logger log = Logger.getLogger(main.class.getName());

    public int add(int a, int b) {
        return a+b;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        log.trace("This is a Trace");
        log.debug("This is a Debug");
        log.info("This is an Info");
        log.warn("This is a Warn");
        log.error("This is an Error");
        log.fatal("This is a Fatal");
    }
    
}
