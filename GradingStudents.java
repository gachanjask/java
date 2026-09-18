import java.util.Vector;
class GradingStudents{
	public static void main(String[] args){
		Vector<Integer> grades = new Vector<Integer>();
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);

		Vector<Integer> results = new Vector<Integer>();

		for(int g: grades){
			if(g < 38){
				results.add(g);
				continue;
			}
			int num = 5  - (g % 5);
			if(num <= 2){
				int r = 0;
				r = g + num;
				results.add(r);
			}
			else{
				results.add(g);

			}
		}
		return results;
	}
}

