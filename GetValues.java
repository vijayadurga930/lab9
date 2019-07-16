package Lab9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GetValues{
	  public static List<String> getValues(HashMap<Integer, String> map)

	 
	    {
	        Collection<String> collection = map.values();
	        List<String> list = new ArrayList<String>();
	        list.addAll(collection);
	        return list;
	    }

	 

	    public static void main(String[] args) {
	        HashMap<Integer, String> map = new HashMap<>();
	        map.put(1, "pen");
	        map.put(3, "book");
	        map.put(4, "bag");
	        map.put(6, "plank");
	        map.put(5, "scale");
	        List<String> list1 = getValues(map);
	        System.out.println(list1);

	 

	    }

	 

	}
	 
}
	
	
