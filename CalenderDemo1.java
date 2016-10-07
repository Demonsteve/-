package API.day03;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calender
 * 日历类
 * 通常使用该类对时间进行操作
 * 常用实现类java.util.GregorianCanlender
 * 
 * @author tarena
 *
 */
public class CalenderDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 默认创建出来的Calendar的 的实现类表示当前系统时间
		 */
		Calendar c=Calendar.getInstance();
		/**
		 * toString重写了，但是不能直观的反应当前的时间
		 */
		System.out.println(c);
		/**
		 * Calendar->Date
		 * Calendar提供了方法：
		 * Date getTime（）
		 * 该方法会返回一个Date实例，该实例表示时间就是Calendar表示的时间
		 */
		Date date=c.getTime();
		System.out.println(date);
		/**
		 * Date->Calendar
		 * void setTime(Date date)
		 */
		c.setTime(date);
		System.out.println(c);
	}
}
