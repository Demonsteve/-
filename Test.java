package API.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ����������Ҫ���û������Լ�������
 * ��ʽ��yyyy-MM-dd
 * Ȼ�󾭹����㣬���������λ�û��˶����죬Ȼ�󾭹�������������10000�ļ����գ�
 * ��ʽΪyyyy��MM��dd��
 * 
 * @author tarena
 *
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=new Date();
		System.out.println("����������ڣ�");
		Date b=sdf.parse(scan.next());
		long day=b.getTime()/(1000*24*60*60);
		long now=date.getTime()/(1000*24*60*60);
		long day2=now-day;
		System.out.println(day2);
		long time10=(day+10000)*24*60*60*1000;
		b.setTime(time10);
		String b1=sdf.format(b);
		System.out.println(b1);
		scan.close();
	}
}
