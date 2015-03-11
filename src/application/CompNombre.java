package application;

import java.util.Comparator;

/**
 *
 * @author moi
 */
public class CompNombre implements Comparator<Test>{

    @Override
    public int compare(Test o1, Test o2){
        
       /* if (o1.nombre > o2.nombre) {
            return 1;
        } else {
            return -1;
        }   */
        
        int result;
        result = (o1.nombre > o2.nombre) ? 1 : -1;
        
        return result;
    }            
}
