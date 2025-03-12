class CountingValleys{
	public static void main(String[] args){
		String path = "UDDDUDUUDU";
		int alt = 0;
		int valleys = 0;
		for(int x = 0; x <= path.length() - 1; x++){
			if(path.charAt(x) == 'U'){
				alt++;
			}
			else{
				if(alt == 0){
					valleys++;
				}
				alt--;
			}
			System.out.println(alt);
		}
		System.out.println("Steps = " + path.length() + " : Valleys = " + valleys);
		
	}
}
