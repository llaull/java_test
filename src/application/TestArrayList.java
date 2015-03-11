package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/***
 *
 * @author Moi
 */
public class TestArrayList {
    
    public static void action(){
        
        //entre <> le type de la liste
        List<String> listeVilles = new ArrayList<>();
        
        listeVilles.add("Paris");
        listeVilles.add("Nice");
        listeVilles.add("Lyon");
        listeVilles.add("Bordeaux");
        listeVilles.add("Lille");
        listeVilles.add("Paris");
        
        //foreach java
        for (String villes : listeVilles) {
            System.out.println("ville dispo :" + villes);
        }
        
        //avec iterator plus modern
       Iterator i = listeVilles.iterator();
        while (i.hasNext()) {            
            System.out.println("ville :" + i.next());
        }
                
    }
    
}