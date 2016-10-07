package API.day03;

import java.util.Calendar;
import java.util.Date;

/**
 * 使用Calendar计算时间
 * @author tarena
 *
 */
public class CalenderDemo5 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		// TODO Auto-generated method stub
		/**
		 * 查看3年1个月零2天以后是哪天
		 * void add（int filed,int value）
		 * 对指定的时间分量累加指定的值，若value是负数，则减
		 */
		calendar.add(Calendar.YEAR, 3);
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DAY_OF_YEAR, 2);
		calendar.set(Calendar.DAY_OF_WEEK, 2);
		System.out.println(calendar.getTime());
		/**
		 * 
		 * 要求用户输入一个日期，并对日期进行日期类的计算后，经计算后的日期在一指定的个数输出给用户
		 * String->simpledateformat-->date
		 * date->calendar
		 * 使用calendar进行相应的计算
		 * calendar--》DATE
		 * DATE->SIMPLEDATEFORMAT-->string
		 * 
		 * 
		 */
		
	}

}
