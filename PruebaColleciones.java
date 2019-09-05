import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PruebaColleciones
{
    public static void main(String [] args)
    {
        //int es nativo
        //Integer es un objetos
        ArrayList<Integer> enteros;
        enteros = new ArrayList<>(); //notacion diamante
        enteros.add(5);
        enteros.add(7);
        enteros.add(9);
        enteros.add(1,6);
        /*for (Integer num : enteros){  //For each
            System.out.println( num );
        }*/
        Iterator<Integer> it;  //Delaracion
        it = enteros.iterator();  //inicializacion
        while(it.hasNext())
        {
            Integer num= it.next();
            if(num % 2 == 0){
                it.remove();
            }
        }
        System.out.println(enteros);
        
        ListIterator<Integer> itr;
        itr = enteros.listIterator( enteros.size());
        while(itr.hasPrevious())
        {
            Integer num = itr.previous();
            System.out.println(num);
        }
    }
}
