package API.day03;

import java.util.Calendar;

/**
 * ��ȡĳһʱ���������������ֵ
 * @author tarena
 *
 */
public class CalenderDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub=
		Calendar calendar=Calendar.getInstance();
		//�鿴���¹�������
		int days=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		//�鿴���깲������
		days=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(days);
	}

}
