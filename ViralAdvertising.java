class ViralAdvertising{
	public static void main(String[] args){
		int stop = 3;
		ViralAdvertising va = new ViralAdvertising();
		int result = va.viralAdvertising(stop);
		System.out.println(result);
	}

	public static int viralAdvertising(int n) {
		double like = Math.floor(5/2);
		double reach = like;

		for(int x = 2; x <= n; x++){
			double target = like * 3;
			like = Math.floor(target/2);
			reach = reach + like;
		}

		return (int) reach; 
	}

}
