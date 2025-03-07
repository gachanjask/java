import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
class BillDivision{
	public static void main(String[] args){
		int k = 1; // item that anna did not eat
		int b = 7; // amount anna was billed
		List<Integer> bill = new ArrayList<Integer>();
		bill.add(3);
		bill.add(10);
		bill.add(2);
		bill.add(9);
		bill.remove(1);
		Iterator i = bill.iterator();
		int sum = 0;
		while(i.hasNext()){
			int entry = (Integer) i.next();
			sum = sum + entry;
		}
		int correct = sum / 2;
		int overcharge = b - correct;

		if(overcharge != 0){

			System.out.println(overcharge);
		}
		else{
			System.out.println("Bon Appetit");
		}




	}
}
