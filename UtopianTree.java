class UtopianTree{
	public static void main(String[] args){

		int n = 1;
		int h = 1;
		for(int x = 1; x <= n; x++){
			int mond = x % 2;
			if(mond == 1){
				h = h * 2;
			}
			else{
				h++;
			}
			System.out.println("Mond = " + mond + " h = " + h);

		}
		System.out.println(h);
	}
}
