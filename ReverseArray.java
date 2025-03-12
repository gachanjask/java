import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
class ReverseArray{
	public static void main(String[] args){
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		a.add(1);
		a.add(4);
		a.add(3);
		a.add(2);
		for(int x = a.size() - 1; x >= 0; x--){
			b.add(a.get(x));
		}
	}
}
