package API.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 程序启动后要求用户输入自己的生日
 * 格式：yyyy-MM-dd
 * 然后经过计算，输出到今天位置活了多少天，然后经过计算输出其出生10000的纪念日，
 * 格式为yyyy年MM月dd日
 * 
 * @author tarena
 *
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=new Date();
		System.out.println("输入出生日期：");
		Date b=sdf.parse(scan.next());
		long day=b.getTime()/(1000*24*60*60);
		long now=date.getTime()/(1000*24*60*60);
		long day2=now-day;
		System.out.println(day2);
		long time10=(day+10000)*24*60*60*1000;
		b.setTime(time10);
		String b1=sdf.format(b);
		System.out.println(b1);
		scan.close();
	}
}
