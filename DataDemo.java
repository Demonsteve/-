package API.day03;
/**
 * �����ÿһ��ʵ�����ڱ�ʾһ�������ʱ���
 * �ڲ�ά��һ��longֵ������Ϊ1970��Ԫ������Data
 * ��ʾ��ʱ��֮���������ĺ���
 * Data��Ϊ�漰ȱ�ݣ����Դ󲿷ַ�����������Ϊ��ʱ�ģ����ٽ���ʹ�ã��������������ʾһ��ʱ��
 */
import java.util.Date;

public class DataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date data=new Date();
		/**
		 * Data
		 */
		System.out.println(data);
		long time =data.getTime();
		System.out.println(time);
		time+=1000*24*60*60;
		data.setTime(time);
		System.out.println(data);
	}
}
