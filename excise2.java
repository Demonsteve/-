package API.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class excise2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//第一题
		Scanner scan=new Scanner(System.in);
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getTime());
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		Date date=calendar.getTime();
		System.out.println(date);
		//第二题
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=sdf.format(d);
		System.out.println(str);
		
		//第五题
		Collection c=new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		System.out.println("目前元素的个数为：");
		System.out.println(c.size());
		if (c.contains("four")) {
			System.out.println("包含");
		} else {
			System.out.println("不包含");
		}
		if (c.isEmpty()) {
			System.out.println("空的");
		} else {
			System.out.println("不是空的");
		}
		c.clear();
		System.out.println("目前元素的个数为：");
		System.out.println(c.size());
		if (c.isEmpty()) {
			System.out.println("空的");
		} else {
			System.out.println("不是空的");
		}
		//第三题
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("请输入出生日期（yyyy-MM-dd）：");
		Date bir=sdf1.parse(scan.next());
		long birtime=bir.getTime()/(1000*24*60*60);
		long now=d.getTime()/(1000*24*60*60);
		long week=(now-birtime)/7;
		System.out.println("到目前为止您一共活了"+week+"周");
	}

}
