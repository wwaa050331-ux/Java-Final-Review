package week13;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		
		map.put(36,"basick");
		map.put(40,"koonta");
		map.put(21,"Layone");
		
		Set<Map.Entry<Integer, String>> entrySet=map.entrySet();
		for(Entry n: entrySet)
			System.out.println(n.getKey()+":"+n.getValue());
		System.out.println();
		
		Set<Integer> keySet=map.keySet();
		
		for(Integer k:keySet)
			System.out.print(k+":"+map.get(k)+"\t");
		System.out.println();
		
		for(Iterator<Integer> itr=keySet.iterator(); itr.hasNext();) {
			Integer key=itr.next();
			System.out.println(key+":"+map.get(key));
		}
}

}
