package API.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.simpletDataFormat
 * 该类可以根据一个指定的日期格式将Data与String之间进行相互转换
 * @author tarena
 *
 */
public class SimpleDataFormatDemo1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		String str=sdf.format(date);
		System.out.println(str);
	}

}
