package API.day03;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calender
 * ������
 * ͨ��ʹ�ø����ʱ����в���
 * ����ʵ����java.util.GregorianCanlender
 * 
 * @author tarena
 *
 */
public class CalenderDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Ĭ�ϴ���������Calendar�� ��ʵ�����ʾ��ǰϵͳʱ��
		 */
		Calendar c=Calendar.getInstance();
		/**
		 * toString��д�ˣ����ǲ���ֱ�۵ķ�Ӧ��ǰ��ʱ��
		 */
		System.out.println(c);
		/**
		 * Calendar->Date
		 * Calendar�ṩ�˷�����
		 * Date getTime����
		 * �÷����᷵��һ��Dateʵ������ʵ����ʾʱ�����Calendar��ʾ��ʱ��
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
