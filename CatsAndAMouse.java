class CatsAndAMouse{
	public static void main(String[] args){
		int x = 1;
		int y = 3;
		int z = 2;
		int dx = x - z;
		int dy = y - z;
		if(dx < 0){
			dx = dx * (-1);
		}
		if(dy < 0){
			dy = dy * (-1);
		}
		if(dx > dy){
			System.out.println("Cat A");
		}
		if(dy > dx){
			System.out.println("Cat B");
		}
		if(dx == dy){
			System.out.println("Mouse C");
		}

	}

}
