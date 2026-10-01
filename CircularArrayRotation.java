import java.util.List;
import java.util.ArrayList;

class CircularArrayRotation{
	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);

		List<Integer> positions = new ArrayList<Integer>();
		positions.add(3);
		positions.add(2);

		CircularArrayRotation car = new CircularArrayRotation();
		car.circularArrayRotation(list, 12, positions);

	}



	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
		if(k > a.size()){
			k = k % a.size();
			if(k == 0){
				return a;
			}
		}
		List<Integer> sub = new ArrayList<Integer>( a.subList( a.size() - k, a.size()));
		for(int x = a.size(); x > k; x--){
			a.set(x - 1, a.get((x - 1) - k));
		}
		for(int y = 0; y < sub.size(); y++){
			a.set(y, sub.get(y));
		}

		List<Integer> result = new ArrayList<Integer>();
		for( int v : queries){
			result.add( a.get(v));
		}
		return result;
	}

}
