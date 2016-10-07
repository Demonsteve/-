package API.day03;

import java.util.ArrayList;
import java.util.Collection;

import API.day02.Point;

/**
 * 集合只能用来保存引用类型元素，并且保存的是元素的引用
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
