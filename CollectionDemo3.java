package API.day03;

import java.util.ArrayList;
import java.util.Collection;

import API.day02.Point;

/**
 * ����ֻ������������������Ԫ�أ����ұ������Ԫ�ص�����
 * @author tarena
 *
 */
public class CollectionDemo3 {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		Point p=new Point(1,2);
		c.add(p);
		System.out.println(p);
		System.out.println(c);
		p.setX(2);
		System.out.println(p);
		System.out.println(c);
	}
}
