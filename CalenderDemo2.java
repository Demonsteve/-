package API.day03;

import java.util.Calendar;

public class CalenderDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		//��ȡ��
		int year=calendar.get(Calendar.YEAR);
		System.out.println("year"+year);
		//��ȡ�£��·ݴ�0��ʼ
		int month=calendar.get(Calendar.MONTH)+1;
		System.out.println("month:"+month);
		//��ȡ��
		/**
		 * �����йص�ʱ�������
		 * Date��Day_Of_Month��һ�µģ���ʾ���е��죬
		 * DAY_OF_YEAR��ʾ���е���
		 * DAY_OF_WEEK��ʾ���е���
		 */
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"-"+month+"-"+day);
		int days=calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("�����ǽ���ĵ�"+days+"�졣");
		int index=calendar.get(Calendar.DAY_OF_WEEK)-1;
		String[] date={"��","һ","��","��","��","��","��"};
		System.out.println("��"+date[index]);
		/**
		 * hour,hour_of_day
		 */
		int h=calendar.get(Calendar.HOUR_OF_DAY);
		int m=calendar.get(Calendar.MINUTE);
		int s=calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
	}
}
