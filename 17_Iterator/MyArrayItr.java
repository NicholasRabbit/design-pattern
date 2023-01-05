
import java.util.*;

//数组的迭代器
public class MyArrayItr implements Iterator<Integer> {
	
	private int[] dataArr;
	private int cursor;  //实例变量默认初始值是0，从下标0开始。

	public MyArrayItr(){
	
	}
	public MyArrayItr(int[] dataArr){
		this.dataArr = dataArr;
	}
	
	//实现方法，这里的写法和JDK的实现优点不同，JDK的ArrayList中下标初始位置是-1

	public boolean hasNext(){
		if(cursor >= dataArr.length)
			return false;
		else
			return true;
	}
	
	//int等基本数据类型不能用泛型，所以这里实现方法返回值写其包装类。
	public Integer next(){
		int retValue = dataArr[cursor];
		cursor ++;
		return retValue;
	}


}