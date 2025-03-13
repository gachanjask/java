class ElectronicsShop{
	public static void main(String[] args){
		int b = 50;
		int[] keyboards = {40,50,60};
		int[] drives = {5,8,12};
		int bestBuy = -1;
		for(int x = 0; x <= keyboards.length - 1; x++){
			for(int y = 0; y <= drives.length - 1; y++){
				int sum = keyboards[x] + drives[y];
				if(
						(sum > bestBuy) 
						&&
						(sum <= b)
				  ){
					bestBuy = sum;

				  }

			}
		}

		System.out.println(bestBuy);
	}
}
