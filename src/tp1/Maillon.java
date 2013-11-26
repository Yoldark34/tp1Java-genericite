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
public class Maillon <T> {
        private Maillon previous;
        private Maillon next;
        private T value;
        
        public boolean hasPrevious() {
            return previous != null;
        }
        
        public boolean hasNext() {
            return next != null;
        }

        public Maillon getPrevious() {
            return previous;
        }

        public void setPrevious(Maillon previous) {
            this.previous = previous;
        }

        public Maillon getNext() {
            return next;
        }

        public void setNext(Maillon next) {
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
}
