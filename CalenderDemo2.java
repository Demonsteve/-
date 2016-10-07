package API.day03;

import java.util.Calendar;

public class CalenderDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		//获取年
		int year=calendar.get(Calendar.YEAR);
		System.out.println("year"+year);
		//获取月，月份从0开始
		int month=calendar.get(Calendar.MONTH)+1;
		System.out.println("month:"+month);
		//获取日
		/**
		 * 和天有关的时间分量：
		 * Date，Day_Of_Month是一致的，表示月中的天，
		 * DAY_OF_YEAR表示年中的天
		 * DAY_OF_WEEK表示周中的天
		 */
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"-"+month+"-"+day);
		int days=calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("今天是今年的第"+days+"天。");
		int index=calendar.get(Calendar.DAY_OF_WEEK)-1;
		String[] date={"日","一","二","三","四","五","六"};
		System.out.println("周"+date[index]);
		/**
		 * hour,hour_of_day
		 */
		int h=calendar.get(Calendar.HOUR_OF_DAY);
		int m=calendar.get(Calendar.MINUTE);
		int s=calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
	}
}
