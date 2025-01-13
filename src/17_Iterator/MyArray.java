
import java.util.*;

//数据是数组的形式
public class MyArray {
	
	private int[] dataArr;
	//初始下标
	private int index;
	//默认初始化容量
	private final static int DEFAULT_CAPACITY = 5;  

	public MyArray(){
		dataArr = new int[DEFAULT_CAPACITY];
	}
	
	public MyArray(int capacity){
		//初始化数组
		dataArr = new int[capacity];
	}
	
	//获取迭代器
	public Iterator iterator(){
		//创建迭代器的收把数组传进去。
		return new MyArrayItr(dataArr);  
	}

	
	//添加元素
	public void add(int e){
		if(index >= dataArr.length){
			throw new RuntimeException("数组已满");
		}
		dataArr[index] = e;
		index ++;
	}

	//根据下标获取元素
	public int get(int index){
		if(index < 0 || index >= dataArr.length){
			new IndexOutOfBoundsException("数组越界");
		}
		return dataArr[index];
	}


	public int[] getDataArr(){
		return this.dataArr;
	}


}