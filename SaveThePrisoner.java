import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.Arrays;
class SaveThePrisoner{
	public static void main(String[] args){
		if(args.length > 0){
			Path path = Paths.get(args[0]);
			try(Stream<String> lines = Files.lines(path)){
				lines.forEach( line -> {
						String ln = line.trim();
						int[] intArray = Arrays.stream(ln.split(" "))
						.mapToInt(Integer::parseInt)
						.toArray();

						   SaveThePrisoner stp = new SaveThePrisoner();
						   int prisoner = stp.saveThePrisoner(intArray[0], intArray[1], intArray[2]);
						   if(prisoner != intArray[3]){
						   System.out.print("Prisoners = " + intArray[0]);
						   System.out.print(" | Sweets = " + intArray[1]);
						   System.out.print(" | Start = " + intArray[2]);
						   System.out.print(" | Result = " + intArray[3]);
						   System.out.println(" | YOUR ANSWER = " + prisoner);
						   }
						}
					     );
			}
			catch(IOException e){
				e.printStackTrace();
			}

		}


	}



	/**
n: the number of prisoners
m: the number of sweets
s: the chair number to start passing out treats at
	 **/

	public static int saveThePrisoner(int n, int m, int s) {
		int mod = m % n;
		int lastPos = (s + mod) - 1;
		if(lastPos > n){
			return lastPos - n;
		}
		if(lastPos == 0){
			return n;
		}
		return lastPos;
	}


}



