package API.day03;

import java.util.Calendar;

/**
 * 获取某一时间分量所允许的最大值
 * @author tarena
 *
 */
public class CalenderDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub=
		Calendar calendar=Calendar.getInstance();
		//查看当月共多少天
		int days=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		//查看今年共多少天
		days=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(days);
	}

}
