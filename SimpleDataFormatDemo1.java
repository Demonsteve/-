package API.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.simpletDataFormat
 * ������Ը���һ��ָ�������ڸ�ʽ��Data��String֮������໥ת��
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
