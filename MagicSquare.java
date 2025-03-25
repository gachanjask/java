import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
class MagicSquare{
	public static void main(String[] args){

/*
Input (stdin)
4 5 8
2 4 1
1 9 7
Expected Output
14
*/
		List<List<Integer>> l = new ArrayList<List<Integer>>();

		List<Integer> r1 = new ArrayList<Integer>();
		r1.add(4);
		r1.add(5);
		r1.add(8);


		List<Integer> r2 = new ArrayList<Integer>();
		r2.add(2);
		r2.add(4);
		r2.add(1);



		List<Integer> r3 = new ArrayList<Integer>();
		r3.add(1);
		r3.add(9);
		r3.add(7);

		l.add(r1);
		l.add(r2);
		l.add(r3);

		//Hackerrank challenge starts here
		int minCost = 0;
		for( List<Integer> row : l){
			int rowCost = 0;
			for( Integer num : row){
				rowCost = rowCost + num;
			}
			if(rowCost <= 15){
				minCost = minCost + (15 - rowCost);
			}
			if(rowCost > 15){
				minCost = minCost + ( rowCost - 15);

			}

		}

		int diagCost = 15 - ( l.get(2).get(0) + l.get(1).get(1) + l.get(0).get(2)) ;
		minCost = minCost + diagCost;
		System.out.println(minCost);
	}
}
