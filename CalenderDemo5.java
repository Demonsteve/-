package API.day03;

import java.util.Calendar;
import java.util.Date;

/**
 * ʹ��Calendar����ʱ��
 * @author tarena
 *
 */
public class CalenderDemo5 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		// TODO Auto-generated method stub
		/**
		 * �鿴3��1������2���Ժ�������
		 * void add��int filed,int value��
		 * ��ָ����ʱ������ۼ�ָ����ֵ����value�Ǹ��������
		 */
		calendar.add(Calendar.YEAR, 3);
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DAY_OF_YEAR, 2);
		calendar.set(Calendar.DAY_OF_WEEK, 2);
		System.out.println(calendar.getTime());
		/**
		 * 
		 * Ҫ���û�����һ�����ڣ��������ڽ���������ļ���󣬾�������������һָ���ĸ���������û�
		 * String->simpledateformat-->date
		 * date->calendar
		 * ʹ��calendar������Ӧ�ļ���
		 * calendar--��DATE
		 * DATE->SIMPLEDATEFORMAT-->string
		 * 
		 * 
		 */
		
	}

}
