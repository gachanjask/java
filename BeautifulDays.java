class BeautifulDays{
	public static void main(String[] args){
		BeautifulDays bd = new BeautifulDays();
		int x = bd.beautifulDays(20,23,6);
		System.out.println(x);


	}

	public static int beautifulDays(int i, int j, int k) {
		int result = 0;
		for(int x = i; x <= j; x++){
			String s = String.valueOf(x);
			String reverse = "";
			for(int y = s.length() - 1; y >= 0; y-- ){
				reverse = reverse.concat(  String.valueOf(s.charAt(y)));

			}
			int diff = x - Integer.valueOf(reverse);
			int mod = diff % k;
			if( mod == 0){
				result++;
			}

		}
		return result;


	}
}
