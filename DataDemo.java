package API.day03;
/**
 * 该类的每一个实例用于表示一个具体的时间点
 * 内部维护一个long值，改制为1970年元旦到该Data
 * 表示的时间之间所经历的毫秒
 * Data因为涉及缺陷，所以大部分方法都被设置为过时的，不再建议使用，所以现在用其表示一个时间
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
