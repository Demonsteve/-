package API.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class excise2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//��һ��
		Scanner scan=new Scanner(System.in);
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getTime());
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		Date date=calendar.getTime();
		System.out.println(date);
		//�ڶ���
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=sdf.format(d);
		System.out.println(str);
		
		//������
		Collection c=new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		System.out.println("ĿǰԪ�صĸ���Ϊ��");
		System.out.println(c.size());
		if (c.contains("four")) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}
		if (c.isEmpty()) {
			System.out.println("�յ�");
		} else {
			System.out.println("���ǿյ�");
		}
		c.clear();
		System.out.println("ĿǰԪ�صĸ���Ϊ��");
		System.out.println(c.size());
		if (c.isEmpty()) {
			System.out.println("�յ�");
		} else {
			System.out.println("���ǿյ�");
		}
		//������
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("������������ڣ�yyyy-MM-dd����");
		Date bir=sdf1.parse(scan.next());
		long birtime=bir.getTime()/(1000*24*60*60);
		long now=d.getTime()/(1000*24*60*60);
		long week=(now-birtime)/7;
		System.out.println("��ĿǰΪֹ��һ������"+week+"��");
	}

}
