import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
class SalesByMatch{
	public static void main(String[] args){
		List<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(20);
		ar.add(10);
		ar.add(10);
		ar.add(30);
		ar.add(50);
		ar.add(10);
		ar.add(20);
		Iterator i = ar.iterator();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		while(i.hasNext()){
			int entry = (Integer)  i.next();
			hm.put(entry, hm.getOrDefault(entry, 0) + 1);
		}
		int fullPairs = 0;
		for(Map.Entry<Integer, Integer> sock: hm.entrySet()){
			fullPairs = fullPairs + (int) Math.floor( sock.getValue() / 2);
		}
		System.out.println(fullPairs);
	}
}
