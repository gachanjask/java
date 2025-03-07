import java.time.Year;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class dayOfProgrammer{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the year: ");
		String yearInput = scanner.nextLine();
		scanner.close();
		int programmerDay = 256;
		int yearVal = Integer.valueOf(yearInput);
		if (yearVal < 1917) {
			if (
					(yearVal & 4) == 0
					&&
					(yearVal & 100 ) == 0

			   ){
				programmerDay--;
			}
		}
		if(yearVal == 1918){
			programmerDay = programmerDay + 13;
		}
		Year year = Year.parse(yearInput);
		LocalDate localDate = LocalDate.parse(year.atDay(programmerDay).toString());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.YYYY");
		System.out.println(localDate.format(dtf));

	}
}



/*
   Wrong Answer
   Input (stdin)
   1918
   Expected Output
   26.09.1918
 */

