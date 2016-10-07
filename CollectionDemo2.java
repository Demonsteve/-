package API.day03;

import java.util.ArrayList;
import java.util.Collection;

import API.day02.Point;

/**
 * 判断集合是否包含指定元素
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
		 * 判断集合是否包含给定的元素，是用EQULAS比较的
		 * 
		 */
		if (c.contains(p)) {
			System.out.println("包含");
		} else {
			System.out.println("不包含");
		}
		System.out.println(c);
	}
}
