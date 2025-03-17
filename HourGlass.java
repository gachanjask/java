import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class HourGlass{
	public static void main(String[] args){
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		arr.add( new ArrayList<Integer>(List.of(-1,-1,0,-9,-2,-2)));
		arr.add( new ArrayList<Integer>(List.of(-2,-1,-6,-8,-2,-5)));
		arr.add( new ArrayList<Integer>(List.of(-1,-1,-1,-2,-3,-4)));
		arr.add( new ArrayList<Integer>(List.of(-1,-9,-2,-4,-4,-5)));
		arr.add( new ArrayList<Integer>(List.of(-7,-3,-3,-2,-9,-9)));
		arr.add( new ArrayList<Integer>(List.of(-1,-3,-1,-2,-4,-5)));

		int highest = -60;
		int hourglass = 0;
		for(int x = 1; x <= 4; x++){
			for(int y = 1; y <= 4; y++){
				hourglass = arr.get(x).get(y)
					+ arr.get(x-1).get(y-1)
					+ arr.get(x-1).get(y)
					+ arr.get(x-1).get(y+1)

					+ arr.get(x+1).get(y-1)
					+ arr.get(x+1).get(y)
					+ arr.get(x+1).get(y+1) ;
				if(hourglass > highest){
					highest = hourglass;
				}

			}
		}
		System.out.println(highest);

	}
}
