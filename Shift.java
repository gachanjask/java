import java.util.ArrayList;
import java.util.List;

class Shift{
	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);

		Shift s = new Shift();
		for(int x = 1; x < 30; x++){
			list = s.rotateNums(list);
			System.out.println("-----------------");
		}


	}


	public static List<Integer> rotateNums(List<Integer> nums){

		int last = nums.get(nums.size() - 1);
		for( int x = nums.size() - 1; x > 0; x--){
			nums.set(x, nums.get(x - 1));
		}
		nums.set(0, last);

		for(int val : nums){
			System.out.println(val);
		}

		return nums;


	}


}
