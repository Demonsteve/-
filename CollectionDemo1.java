package API.day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合
 * java.util.Collection
 *该接口是所有集合的父接口，会定了集合应当具有的相关方法
 *共派生了两个子接口：
 *List：可重复集，有序即，可以根据下标操作元素
 *set：不可重复集
 *重复元素的判断标准是依靠元素自身equals比较的结果。
 * @author tarena
 *
 */
public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		/**
		 * boolean add(E e)
		 * 向当前集合中添加元素
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/**
		 * int size()
		 * 返回当前集合的元素个数
		 */
		System.out.println("size:"+c.size());
		System.out.println(c.isEmpty());
		//清空元素
		c.clear();
		//判断集合内是否为空
		System.out.println(c.size());
		System.out.println(c.isEmpty());
	}
}
