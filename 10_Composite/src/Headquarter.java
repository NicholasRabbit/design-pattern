
import java.util.*;

//公司总部
public class Headquarter extends Company{
	
	//下级公司集合
	private List<Company> provinceList = new ArrayList<>();

	
	public Headquarter(){
	
	}
	public Headquarter(String name,String description){
		super(name,description);  //给父类有参构造函数赋值。
	}
	
	//继承的方法权限可以更大，不能更小，这里用public权限修饰符也可以。复习javase
	//添加下级
	protected void add(Company company){
		provinceList.add(company);
	}
	
	//移除下级
	protected void remove(Company company){
		provinceList.remove(company);
	}

	//展示下级公司
	public void print(){
		Iterator<Company> it = provinceList.iterator();
		System.out.println("=======" + getName() + "=========");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

	


}