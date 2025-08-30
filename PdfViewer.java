import java.util.List;
import java.util.ArrayList;
class PdfViewer{
	public static void main(String[] args){
		String word = "zaba";
		char[] chars = word.toCharArray();
		List<Integer> h = new ArrayList<Integer>();
		h.add(1);
		h.add(3);
		h.add(1);
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(5);
		h.add(5);
		h.add(5);
		h.add(5);
		h.add(5);
		h.add(5);
		h.add(5);
		h.add(5);
		h.add(5);
		h.add(5);
		h.add(5);
		h.add(5);
		h.add(5);
		h.add(5);
		h.add(5);
		h.add(7);

		int max = 0;
		for(char a : chars){
			int ascii = a - 97;
			if( h.get(ascii) > max){
				max = h.get(ascii);
			}
		}
		int wordLength = chars.length;
		int result = wordLength * max;
		System.out.println(result);

	}
}
