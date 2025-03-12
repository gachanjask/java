class DrawingBook{
	public static void main(String[] args){
		int n = 5;
		int p = 4;
		int mid = n  / 2;
		int steps = 0;
		if(p <= mid){

			steps = (int) Math.ceil( p / 2);	
		}
		if(p > mid){
			if( (n % 2) == 0){
				double div = Math.ceil((double)(n - p) / 2);
				steps = (int) div;
			}
			if( (n % 2) == 1){
				steps = (int) Math.ceil((n - p) / 2);
			}

		}
		System.out.println(steps);
	}

}
