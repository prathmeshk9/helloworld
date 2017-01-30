import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
public class HelloWorld{
	public static void main(String[] args) {

		String time1 =  "18:25:00.000000";
		System.out.println(convertTimeFormat(time1));
		
		String date1 =  "2017-01-19";
		System.out.println(converDateFormat(date1));
	}
	
	public static String convertTimeFormat(String createdTime){
        StringTokenizer tk = new StringTokenizer(createdTime);
        //String date = tk.nextToken();
        String time = tk.nextToken();

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat sdfs = new SimpleDateFormat("hh:mm a");
        SimpleDateFormat sdfs1 = new SimpleDateFormat("yyyy-MM-dd");

        Date dt = null;
        Date dt1 = null;
        try {
            dt = sdf.parse(time);
            //System.out.println("Time Display: " + sdfs.format(dt)); // <-- I got result here
            //dt1 = sdfs1.parse(date);
            //System.out.println("Date Display: " + sdfs1.format(dt1)); // <-- I got result here

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return sdfs.format(dt);
    }
	
	public static String converDateFormat(String createdDate){
        StringTokenizer tk = new StringTokenizer(createdDate);
        String date = tk.nextToken();
        //String time = tk.nextToken();

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat sdfs = new SimpleDateFormat("hh:mm a");
        SimpleDateFormat sdfs1 = new SimpleDateFormat("yyyy-MM-dd");
        //System.out.println(" "+sdfs1.format(date));

        Date dt = null;
        Date dt1 = null;
        try {
            //dt = sdf.parse(time);
            //System.out.println("Time Display: " + sdfs.format(dt)); // <-- I got result here
            dt1 = sdfs1.parse(date);
            //System.out.println("Date Display: " + sdfs1.format(dt1)); // <-- I got result here

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return sdfs1.format(dt1);
    }
}
