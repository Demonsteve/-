package API.day03;

import java.util.Calendar;

/**
 * ����ʱ�����
 * @author tarena
 *
 */
public class CalenderDemo3 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		/**
		 * ��ʾ 2008-08-08 20��08:08
		 */
		//������
		calendar.set(Calendar.YEAR, 2008);
		//������
		calendar.set(Calendar.MONTH,Calendar.AUGUST );
		//������
		calendar.set(Calendar.DAY_OF_MONTH, 8);
		//����Сʱ
		calendar.set(Calendar.HOUR_OF_DAY, 20);
		//���÷�
		calendar.set(Calendar.MINUTE, 8);
		//������
		calendar.set(Calendar.SECOND, 8);
		
		calendar.set(Calendar.DAY_OF_MONTH,78);
		
		
		
		//ת��ΪDate�����
		System.out.println(calendar.getTime());
	}
}
