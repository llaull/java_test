package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
        
        //classic
        System.out.println("------------------------------- classic");
        for (int i = 0; i < listeVilles.size(); i++) {
            System.out.println("villes = " + listeVilles.get(i));
            
        }
        
        //methode fonctionnelle
        System.out.println("------------------------------- methode fonctionnelle");
        listeVilles.stream().forEach((villes) -> {
            System.out.println("villes :" + villes);
        });  
        
        //foreach java
         System.out.println("------------------------------- foreach");
        for (String villes : listeVilles) {
            System.out.println("villes :" + villes);
        }
        
        //avec iterator plus moderne  vide le buffer
        System.out.println("------------------------------- Iterator");
       Iterator i = listeVilles.iterator();
        while (i.hasNext()) {            
            System.out.println("villes :" + i.next());
        }
        
        //peut aller dans les 2 sens,
        System.out.println("------------------------------- ListIterator");
        ListIterator<String> li = null;
        li = listeVilles.listIterator();
        while (li.hasNext()) {            
            System.out.println("villes :" + li.next());
        }
        System.out.println("------------------------------- ListIterator previous");
        while (li.hasPrevious()) {            
            System.out.println("villes :" + li.previous());
        }
        
        //melange 
        System.out.println("------------------------------- tri / melange");
        Collections.shuffle(listeVilles);
        for (String villes : listeVilles) {
            System.out.println("villes :" + villes);
        }
                
    }
    
}