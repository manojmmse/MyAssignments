package pack1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;


public class HashMapRevStr 
{

	public static void main(String[] args) 
	{
	      LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
	      
	      lhmap.put(1, "Google");
	      lhmap.put(2, "Firefox");
	      lhmap.put(3, "Safari");
	      lhmap.put(4, "Brave");
	      lhmap.put(5, "Opera");
	      
	      Set<Integer> setKeys = lhmap.keySet();
	      List<Integer> listKeys = new ArrayList<Integer>(setKeys);
	      ListIterator<Integer> iterator = listKeys.listIterator( listKeys.size() );
	      while(iterator.hasPrevious())
	      {
	          System.out.println( lhmap.get( iterator.previous() ) );
	      }

	}

}
