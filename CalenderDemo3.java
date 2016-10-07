package API.day03;

import java.util.Calendar;

/**
 * 设置时间分量
 * @author tarena
 *
 */
public class CalenderDemo3 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		/**
		 * 表示 2008-08-08 20：08:08
		 */
		//设置年
		calendar.set(Calendar.YEAR, 2008);
		//设置月
		calendar.set(Calendar.MONTH,Calendar.AUGUST );
		//设置天
		calendar.set(Calendar.DAY_OF_MONTH, 8);
		//设置小时
		calendar.set(Calendar.HOUR_OF_DAY, 20);
		//设置分
		calendar.set(Calendar.MINUTE, 8);
		//设置秒
		calendar.set(Calendar.SECOND, 8);
		
		calendar.set(Calendar.DAY_OF_MONTH,78);
		
		
		
		//转换为Date型输出
		System.out.println(calendar.getTime());
	}
}
