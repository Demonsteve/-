package API.day03;

import java.util.ArrayList;
import java.util.Collection;

import API.day02.Point;

/**
 * �жϼ����Ƿ����ָ��Ԫ��
 * @author tarena
 *
 */
public class CollectionDemo2 {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c =new ArrayList<>();
		c.add(new Point(3,4));
		c.add(new Point(3,5));
		c.add(new Point(1,2));
		System.out.println(c);
		Point p=new Point(1,2);
		/**
		 *c.add()
		 * boolean contains(E e)
		 * �жϼ����Ƿ����������Ԫ�أ�����EQULAS�Ƚϵ�
		 * 
		 */
		if (c.contains(p)) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}
		System.out.println(c);
	}
}
