package API.day03;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//�����⣺���������
public class excise1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("�������������ڣ�yyyy-MM-dd����");
		String str=scan.next();
		Date date= sdf.parse(str);
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		System.out.println("�����뱣���ڣ���������");
		calendar.add(Calendar.DAY_OF_MONTH, -14+scan.nextInt());
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		date=calendar.getTime();
		//System.out.println(date);
		String str1=sdf.format(date);
		System.out.print("������Ϊ��");
		System.out.println(str1);
		scan.close();
	}
}
