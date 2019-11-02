import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
		
		String time = sdf.format(d).replace(":", "_");
		
		System.out.println(time);
		
	}

}
