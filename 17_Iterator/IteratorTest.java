
import java.util.*;


/*
* 迭代器模式：
* 1，关键点：
* 这种模式允许自定义迭代器针对不同的数据组合迭代，例如数组，集合，Map，树，图等。
* 不需要关心这种数据组合具体是什么形式的，只关心迭代遍历出来使用即可。
* 2，迭代器模式使得对象内部的数据没有暴露给用户，保证了数据的安全，防止修改。
* 3，为不同的数据组合写一个订制的迭代器继承JDK的Iterator，实现不同方式的迭代遍历即可。
* 4，JDK中的迭代器是用内部类的方式实现的，为了方便理解，本例不用内部类。
* 5，其它事项参考个人笔记。
* 
* 
*/
public class IteratorTest {

	public static void main(String[] args){
		
		//本例先写数组的迭代器，其他同理。
		MyArray arr = new MyArray();
		int[] dataArr = arr.getDataArr();
		System.out.println("dataArr's length==>" + dataArr.length);
		Iterator<Integer> itr = arr.iterator();  //泛型问题先不管
		while(itr.hasNext()){
			int value = itr.next();
			System.out.println(value);
		}
		
	}

}