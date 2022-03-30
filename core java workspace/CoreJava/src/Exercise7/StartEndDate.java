package Exercise7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StartEndDate {
	public static void main(String[] args) throws ParseException {
		String startDate = "02/03/2022";
		String endDate = "01/03/2022";

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Date StartD = sdf1.parse(startDate);

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		Date EndD = sdf2.parse(endDate);

		if (StartD.compareTo(EndD) == 1) {
			System.out.println("Error while updating date");
		} else {
			System.out.println("You have feed the correct date!");
		}

	}
}
