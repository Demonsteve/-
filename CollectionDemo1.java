package API.day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����
 * java.util.Collection
 *�ýӿ������м��ϵĸ��ӿڣ��ᶨ�˼���Ӧ�����е���ط���
 *�������������ӽӿڣ�
 *List�����ظ��������򼴣����Ը����±����Ԫ��
 *set�������ظ���
 *�ظ�Ԫ�ص��жϱ�׼������Ԫ������equals�ȽϵĽ����
 * @author tarena
 *
 */
public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		/**
		 * boolean add(E e)
		 * ��ǰ���������Ԫ��
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/**
		 * int size()
		 * ���ص�ǰ���ϵ�Ԫ�ظ���
		 */
		System.out.println("size:"+c.size());
		System.out.println(c.isEmpty());
		//���Ԫ��
		c.clear();
		//�жϼ������Ƿ�Ϊ��
		System.out.println(c.size());
		System.out.println(c.isEmpty());
	}
}
