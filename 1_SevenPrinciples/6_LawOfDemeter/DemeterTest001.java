
import java.util.*;
/*
Law of Demeter :  迪米特法则
1，也叫最少知道原则，The least knowledge principle，
   即一个对象对其它对象保持最少的了解；
2，对自己依赖的类知道的越少越好；
3，只与直接的朋友通信，
   直接的朋友：成员变量，方法形参，方法返回值。
   局部变量不是直接的朋友。
本例不遵守迪米特法则，查看其弊端   
*/

public  class DemeterTest001 {
	
	public static void main(String[] args){
		HeadManager hm = new HeadManager();
		CollegeManager cm = new CollegeManager();
		hm.getAllEmps(cm);
	}
}


//总部管理类
class HeadManager {
	//获取总部员工
	public List<Emp> getHeadEmps(){
		List<Emp> list = new ArrayList<>();
		int id = 1000;
		//增加10个总部员工
		for(int i = 0; i < 10; i++){
			Emp emp = new Emp();
			emp.setId(++id);
			list.add(emp);
		}
		return list;
	}

	// 打印全部员工
	public void getAllEmps(CollegeManager cm){
		// 打印学院员工
		List<CollegeEmp> cempList = cm.getCollegeEmps();  //这里的CollegeEmp就是局部变量，非直接朋友，违反了迪米特法则
		for(CollegeEmp c : cempList){
			System.out.println(c.getId());
		}
		//打印总部员工
		List<Emp> empList = this.getHeadEmps();
		for(Emp e : empList){
			System.out.println(e.getId());
		}
	}

}

//学院管理类
class CollegeManager {

	public List<CollegeEmp> getCollegeEmps(){
		List<CollegeEmp> list = new ArrayList<>();
		int id = 5000;
		//增加10个学院员工
		for(int i = 0; i < 10; i++){
			CollegeEmp cemp = new CollegeEmp();
			cemp.setId(++id);
			list.add(cemp);
		}
		return list;
	}
}

//总部员工：1001 ，1开头
class Emp {
	
	private int id;
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
}
//学院员工:5001，5开头
class CollegeEmp {
	private int id;
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
}

