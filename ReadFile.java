import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
class ReadFile{
	public static void main(String[] args){
		if(args.length > 0){
			Path path = Paths.get(args[0]);
			try(Stream<String> lines = Files.lines(path)){
				lines.forEach( line -> {
						String ln = line.trim();
						System.out.println(ln);
						}
					     );
			}
			catch(IOException e){
				e.printStackTrace();
			}

		}


	}

}
