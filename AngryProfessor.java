import java.util.Vector;
import java.util.Collections;
class AngryProfessor{

	public static void main(String[] args){
		Vector<Integer> a = new Vector<Integer>();
		a.add(23);
		a.add(-35);
		a.add(-2);
		a.add(58);
		a.add(-67);
		a.add(-56);
		a.add(-42);
		a.add(-73);
		a.add(-19); a.add(37);

		int k = 10;

		int tmp = 0;
		for(int b: a){
			if(b <= 0){
				tmp++;
			}
			if(tmp == k){
				break;
			}
		}
		if(tmp >= k){
			return "NO";
		}
		else{
			return "YES";
		}

	}
}


