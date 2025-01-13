
/*
* 公司抽象类
*/
public abstract class Company {
	
	private String name;
	private String description;
	
	public Company(){
	
	}
	public Company(String name,String description){
		this.name = name;
		this.description = description;
	}

	//添加分支方法，这里不写抽象方法，写个空实现，因为末节点不需要添加公司，不需要实现这个添加方法
	//protected修饰符，只有子类能继承，异包的子类也可以
	protected void add(Company company){
		//空实现
		throw new UnsupportedOperationException();
	}
	//这里也是空实现
	protected void remove(Company company){
		throw new UnsupportedOperationException();
	}

	//打印方法做成抽象类，所有子类都要实现。
	public abstract void print();

	
	//setter and getter
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return this.description;
	}

	//重写toString()
	public String toString(){
		return "{" + name + "," + description + "}";
	}

	

}