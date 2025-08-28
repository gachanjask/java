import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class HurdleRace{
	public static void main(String[] args){
		int k = 4;
		List<Integer> height = new ArrayList<Integer>();
		height.add(1);
		height.add(6);
		height.add(3);
		height.add(5);
		height.add(2);
		int diff = Collections.max(height) - k;
		if(diff < 0){
			diff = 0;
		}
		System.out.println(diff);
	}
}
