
import java.util.*;


//城市分部，叶子节点，即末节点
public class CityBranch extends Company {
	

	public CityBranch(){
	
	}
	public CityBranch(String name,String description){
		super(name,description);  //给父类有参构造函数赋值。
	}

	public void print(){
		System.out.println(getName());
	}


}