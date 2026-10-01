import java.util.List;
import java.util.ArrayList;
class SequenceEquation{
	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(2);

		SequenceEquation se = new SequenceEquation();
		List<Integer> res = se.permutationEquation(list);
		for(int d : res){
			System.out.println(d);
		}

	}


	public static List<Integer> permutationEquation(List<Integer> p) {
		List<Integer> result = new ArrayList<Integer>();
		for(int x = 1; x <= p.size(); x++){
			int v1 = p.indexOf(x) + 1;
			int v2 = p.indexOf(v1) + 1;
			result.add(v2);
		}
		return result;

	}

}
