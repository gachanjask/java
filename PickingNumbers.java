import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class PickingNumbers{

	public static void main(String[] args){
		List<Integer> n = new ArrayList<Integer>();
		n.add(4);
		n.add(2);
		n.add(3);
		n.add(4);
		n.add(4);
		n.add(9);
		n.add(98);
		n.add(98);
		n.add(3);
		n.add(3);
		n.add(3);
		n.add(4);
		n.add(2);
		n.add(98);
		n.add(1);
		n.add(98);
		n.add(98);
		n.add(1);
		n.add(1);
		n.add(4);
		n.add(98);
		n.add(2);
		n.add(98);
		n.add(3);
		n.add(9);
		n.add(9);
		n.add(3);
		n.add(1);
		n.add(4);
		n.add(1);
		n.add(98);
		n.add(9);
		n.add(9);
		n.add(2);
		n.add(9);
		n.add(4);
		n.add(2);
		n.add(2);
		n.add(9);
		n.add(98);
		n.add(4);
		n.add(98);
		n.add(1);
		n.add(3);
		n.add(4);
		n.add(9);
		n.add(1);
		n.add(98);
		n.add(98);
		n.add(4);
		n.add(2);
		n.add(3);
		n.add(98);
		n.add(98);
		n.add(1);
		n.add(99);
		n.add(9);
		n.add(98);
		n.add(98);
		n.add(3);
		n.add(98);
		n.add(98);
		n.add(4);
		n.add(98);
		n.add(2);
		n.add(98);
		n.add(4);
		n.add(2);
		n.add(1);
		n.add(1);
		n.add(9);
		n.add(2);
		n.add(4);


		PickingNumbers pn = new PickingNumbers();
		n = pn.arrange(n);
		//		pn.display(n);
		pn.computeSub(n);

	}

	public List<Integer> arrange(List<Integer> x){
		Collections.sort(x);
		return x;
	}


	public void display(List<Integer> x){
		for(int y: x){
			System.out.println(y);
		}
		System.out.println("#####################################");
		System.out.println("#####################################");
	}


	public void computeSub(List<Integer> a){
		int currNum = 0;
		int prevNum = a.get(0);
		int maxArr = 0;
		int tempArr = 1;
		int diff = 0;

		for(int z = 1; z < a.size(); z++){
			currNum = a.get(z);
			diff = currNum - prevNum;
			if(diff >= -1 && diff <= 1){
				tempArr++;
			}
			else{
				if(tempArr > maxArr){
					maxArr = tempArr;
				}
				prevNum = a.get(z);
				tempArr = 1;
			}
		}
		if(tempArr > maxArr){
			maxArr = tempArr;
		}
		System.out.println(maxArr);
	}
}

